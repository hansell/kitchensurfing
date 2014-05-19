package com.kitchensurfing.idaoimpl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
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

	public boolean addUser(User user) {

		String sql = "insert into  user values('" + user.getUsername() + "','"
				+ user.getPwd() + "')";

		jdbcTemplate.execute(sql);

		return true;
	}

}
