package com.kitchensurfing.idaoimpl;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.kitchensurfing.po.User;

public class UserRowMapper implements Serializable,RowMapper<User> {

	private static final long serialVersionUID = 114767036901851042L;
	//默认已经执行rs.next(),可以直接取数据 
	public User mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
		// TODO Auto-generated method stub
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
		return user;
	}

}
