package com.kitchensurfing.idaoimpl;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.kitchensurfing.idao.ILocationDao;
import com.kitchensurfing.po.Location;
import com.kitchensurfing.po.User;
@Repository("LocationDaoImpl")
public class LocationDaoImpl  extends BaseDaoImpl implements Serializable, ILocationDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Location getLocation(final int id) {
		final Location location=new Location();
		// TODO Auto-generated method stub
		String sql="select * from ks_location t where t.location_id=?";
		this.jdbcTemplate.query(sql, new Object[]{id},new RowCallbackHandler(){

			public void processRow(ResultSet rs) throws SQLException {
				// TODO Auto-generated method stub
				location.setLocationId(rs.getInt("location_id"));
				location.setLocationName(rs.getString("location_name"));
				location.setStatused(rs.getString("statused"));
				location.setPid(rs.getInt("pid"));
			}} );
		return location;

	}

	public int getRowCount() {
		// TODO Auto-generated method stub
		int rowCount=this.jdbcTemplate.queryForObject("select count(*) from ks_location",Integer.class);
		return rowCount;
	}

	public Location getLocation(final String name) {
		// TODO Auto-generated method stub
		String sql="select * from ks_location t where t.location_english_code=?";
		List<Location> list= this.jdbcTemplate.query(sql,new Object[]{name},new ResultSetExtractor<List<Location>>(){
			public List<Location> extractData(ResultSet resultSet)
					throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				List<Location> temp=new ArrayList<Location>();
				while(resultSet.next()){
					Location location=new Location();
					location.setLocationId(resultSet.getInt("location_id"));
					location.setLocationName(resultSet.getString("location_name"));
					location.setStatused(resultSet.getString("statused"));
					location.setPid(resultSet.getInt("pid"));
					temp.add(location);
				}
				return temp;
			}
		});
		if(list.size()>0)
			return list.get(0);
		else
			return null;
	}
	public List<Location> getLocation() {
		// TODO Auto-generated method stub
		String sql=" select * from ks_location t";
		return this.jdbcTemplate.query(sql, new ResultSetExtractor<List<Location>>(){

			public List<Location> extractData(ResultSet resultSet)
					throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				List<Location> list=new ArrayList<Location>();
				while(resultSet.next()){
					Location temp=new Location();
					temp.setLocationId(resultSet.getInt("location_id"));
					temp.setLocationName(resultSet.getString("location_name"));
					temp.setStatused(resultSet.getString("statused"));
					temp.setPid(resultSet.getInt("pid"));
					list.add(temp);
				}
				return list;
			}});
	}
static	final class LocationMapper implements RowMapper<Location>{

		public Location mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			Location temp=new Location();
			temp.setLocationId(rs.getInt("location_id"));
			temp.setLocationName(rs.getString("location_name"));
			temp.setStatused(rs.getString("statused"));
			temp.setPid(rs.getInt("pid"));
			// TODO Auto-generated method stub
			return temp;
		}

	}
}
