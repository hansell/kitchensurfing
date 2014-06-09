package com.kitchensurfing.idaoimpl;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.kitchensurfing.po.Chef;

public class ChefRowMapper implements Serializable,RowMapper<Chef> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 503631981981632982L;

	public Chef mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
		// TODO Auto-generated method stub
		Chef chef=new Chef();
		chef.setLocationId(resultSet.getInt("location_id"));
		chef.setUserid(resultSet.getString("user_id"));
		chef.setQq(resultSet.getString("qq"));
		chef.setWebChat(resultSet.getString("webchat"));
		chef.setTravelPlace(resultSet.getString("travel_place"));
		chef.setTagLine(resultSet.getString("tag_line"));
		chef.setStatus(resultSet.getString("status"));
		chef.setQq(resultSet.getString("qq"));
		chef.setPrice(resultSet.getString("price"));
		chef.setPhone(resultSet.getString("phone"));
		chef.setLocationId(resultSet.getInt("location_id"));
		chef.setChefId(resultSet.getInt("chef_id"));
		chef.setAvailableDay(resultSet.getString("aviable_day"));
		chef.setCookstyle(resultSet.getString("cookstyle"));
		chef.setFavoringredientone(resultSet.getString("favoringredientone"));
		chef.setFavoringredienttwo(resultSet.getString("favoringredienttwo"));
		chef.setFavoringredientthree(resultSet.getString("favoringredientthree"));
		chef.setWeblocationone(resultSet.getString("weblocationone"));
		chef.setWeblocationtwo(resultSet.getString("weblocationtwo"));
		chef.setWeblocationthree(resultSet.getString("weblocationthree"));
		chef.setPersonalkey(resultSet.getString("personalkey"));
		chef.setPersonalspecial(resultSet.getString("personalspecial"));
		return chef;
	}

}
