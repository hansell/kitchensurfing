package com.kitchensurfing.idaoimpl;

/**
 * @doc 
 * This is a Spring JdbcTemplate to access database
 * I find that the standard way to access as list is via the query() methods rather than any of the other approaches. 
 * The main difference between query and the other methods is that you'll have to implement one of the callback interfaces
 *  (either RowMapper, RowCallbackHandler, or ResultSetExtractor) to handle your result set.
 * @author Hansel
 * @time
 * @description  here are few methods to show you how to use jdbc template to query or extract data from database
 */
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.kitchensurfing.idao.IUserDao;
import com.kitchensurfing.po.User;

@Repository
public class UserDaoImpl implements IUserDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void init(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	/**
	 * @return User
	 * @param int userId
	 * RowCallbackHandler method uage
	 */
	public User getUserById(final int userId){
		final User user=new User();
		String sql="SELECT * FROM KS_USER U WHERE U.USER_ID = ?";
		this.jdbcTemplate.query(sql, new Object[]{userId}  ,new RowCallbackHandler(){

			public void processRow(ResultSet resultSet) throws SQLException {
				// TODO Auto-generated method stub
				user.setAccount(resultSet.getString("account"));
				user.setAddress(resultSet.getString("address"));
				user.setBirthday(resultSet.getString("birthday"));
				user.setFirstName(resultSet.getString("first_name"));
				user.setGender(resultSet.getString("gender"));
				user.setLastName(resultSet.getString("last_name"));
				user.setLocationId(resultSet.getInt("location_id"));
				user.setProfile_photo(resultSet.getString("profile_photo"));
				user.setStatused(resultSet.getString("statused"));
				user.setUsername(resultSet.getString("username"));
				user.setUserPassword(resultSet.getString("user_password"));
			}});
		return user;
	}
	/**
	 * @return String types password
	 * @param account
	 * @doc using the jdbc template queryforobject
	 */
	public String getUserPassword(final String account) throws DataAccessException{
		String sql="select u.user_password from ks_user u where u.account='"+account+"'";
		return this.jdbcTemplate.queryForObject(sql, String.class);
	}
	/**
	 * @return String types password
	 * @param userId
	 */
	public String getUserPassword(final int userId) throws DataAccessException{
		String sql="select  u.user_password from ks_user u where u.user_id=?";
		return this.jdbcTemplate.queryForObject(sql,new Object[]{userId}, String.class);
	}
	/**
	 * 
	 * @param args
	 * @return
	 */
	public int update(final Object ... args) throws DataAccessException{
		String sql="insert into ks_user(location_id,account,user_password,username) values (?,?,?,?)";

		return this.jdbcTemplate.update(sql, args);
	}
	/**
	 * 
	 * @param user
	 * @return
	 */
	public int InsertUser(final User user) throws DataAccessException{
		String sql="insert into ks_user()";
		return 0;//this.jdbcTemplate.update(sql, args);
	}
	/**
	 * add a User via account,userName and userpassword
	 * param:
	 */
	public boolean addUser(final User user) throws DataAccessException{

		String sql = "insert into  ks_user(account,user_password,username) values(?,?,?,?)";
		//Object params=new Object[]{1,user.getAccount(),user.getUserPassword(),user.getUsername()};
		// int[] argTypes=new int[]{Types.INTEGER,Types.VARCHAR,Types.VARCHAR,Types.VARCHAR};
		//jdbcTemplate.query(sql, params, argTypes, new ResultSetExtractor<User>());
		int i=this.jdbcTemplate.update(sql, new PreparedStatementSetter(){
			public void setValues(PreparedStatement ps) throws SQLException {
				// TODO Auto-generated method stub
				//ps.setInt(1, user.getLocationId());
				ps.setString(1, user.getAccount());
				ps.setString(2, user.getUserPassword());
				ps.setString(3, user.getUsername());
				ps.setString(4, user.getCreateUserDate());
			}
		});
		if(i>0)
			return true;
		else 
			return false;
	}
	/**
	 * @return
	 * @param
	 * @description:* new PersonRowMapper()是一个实现RowMapper接口的类, 
	 * 执行回调,实现mapRow()方法将rs对象转换成PersonBean对象返回 
	 */
	public boolean isUserExists(final User user) {
		// TODO Auto-generated method stub
		try{
			String sql="select *  from ks_user  u where u.account='"+user.getAccount()
					+"' and u.user_password='"+user.getUserPassword()+"'";
			List<User> list=this.jdbcTemplate.query(sql, new UserRowMapper());
			if(list.size()>0)
				return true;
			else
				return false;
		}catch(DataAccessException e){
			throw new RuntimeException(e);
		}
	}
	@SuppressWarnings("deprecation")
	public boolean isUserExists(final String username){
		String sql = "SELECT count(*) FROM KS_USER U WHERE U.USERNAME = ?";
		boolean result = false;
		//The method queryForInt(String, Object...) from the type JdbcTemplate is deprecated
		/**
		 * both queryForInt and queryForLong are desprecated
		 * To fix it, replace the code with queryForObject(String, Class)
		 * int count = getJdbcTemplate().queryForObject(
                        sql, new Object[] { username }, Integer.class);
		 */
		@Deprecated
		int count = this.jdbcTemplate.queryForInt(sql, new Object[] { username });
		if (count > 0) {
			result = true;
		}
		return result;
	}
/*	public <T> boolean isUserExists(Class<T>){
		
	}*/
	/**
	 * @return
	 * 
	 */
	public User getUser(final String account, final String userPassword) throws DataAccessException{
		// TODO Auto-generated method stub
		/*String sql="select * from ks_user u where u.account=? and u.user_password=?";
		Object[] params=new Object[]{account,userPassword};
	    User user=this.jdbcTemplate.queryForObject(sql, params, new UserRowMapper());
	    return user;*/
		String sql="select * from ks_user u where u.account=? and u.user_password=?";
		Object[] params=new Object[]{account,userPassword};
		List<User> list=this.jdbcTemplate.query(sql, params,new UserRowMapper());
		User user=null;
		if(list.size()>0){
			user=list.get(0);
		}
		return user;
	}
	/**
	 * this is the first way to get a list user via ResultSetExtractor
	 * @return List<User>
	 */
	public List<User> getAllUser() throws DataAccessException{
		String sql="select * from ks_user u";
		return this.jdbcTemplate.query(sql,new ResultSetExtractor<List<User>>(){
			public List<User> extractData(ResultSet resultSet) throws SQLException,
			DataAccessException {
				// TODO Auto-generated method stub
				List<User> list=new ArrayList<User>();
				while(resultSet.next()){
					User user=new User();
					user.setAccount(resultSet.getString("account"));
					user.setAddress(resultSet.getString("address"));
					user.setBirthday(resultSet.getString("birthday"));
					user.setFirstName(resultSet.getString("first_name"));
					user.setGender(resultSet.getString("gender"));
					user.setLastName(resultSet.getString("last_name"));
					user.setLocationId(resultSet.getInt("location_id"));
					user.setProfile_photo(resultSet.getString("profile_photo"));
					user.setStatused(resultSet.getString("statused"));
					user.setUsername(resultSet.getString("username"));
					user.setUserPassword(resultSet.getString("user_password"));
					list.add(user);
				}
				return list;
			}
		});
	}
	/**
	 * this is the second ways to complete
	 * get all users via RowMapper
	 * @return
	 */
	public List<User> selectAll() throws DataAccessException{
		String sql="select * from ks_user";
		return this.jdbcTemplate.query(sql,new UserRowMapper());
	}
	/**
	 * here is the queryForList method of jdbcTemplate
	 *  This method returns a List containing HashMap object. The key
	 *   of the map is the table's field name and the value is
	 * the table's field value.
	 * good luck for you
	 */
	public List<Map<String,Object>> getAll() throws DataAccessException{
		String sql="select * from ks_user";
		return this.jdbcTemplate.queryForList(sql);
	}
	/**
	 *  
	 * 第一个参数为执行sql 
	 * 第二个参数为参数数据 
	 * 第三个参数为参数类型 
        @return int
        @param final user
	 */
	public int updateUser(final User user) throws DataAccessException{
		String sql="update ks_user u set u.username=? where id=? ";
		Object[] params=new Object[]{user.getUsername(),user.getUserId()};
		int [] types=new int[]{Types.VARCHAR,Types.INTEGER};
		return this.jdbcTemplate.update(sql, params, types);
	}
}
