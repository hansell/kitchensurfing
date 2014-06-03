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
		chef.setPhoto(resultSet.getString("photo"));
		chef.setWorkNear(resultSet.getString("work_near"));
		chef.setWebChat(resultSet.getString("webchat"));
		chef.setVanityUrl(resultSet.getString("vanity_url"));
		chef.setTravelPlace(resultSet.getString("travel_place"));
		chef.setTrainingSchoolName(resultSet.getString("training_school_name"));
		chef.setTagLine(resultSet.getString("tag_line"));
		chef.setStatused(resultSet.getString("statused"));
		chef.setSchoolLocation(resultSet.getString("school_location"));
		chef.setQq(resultSet.getString("qq"));
		chef.setPrice(resultSet.getString("price"));
		chef.setPhone(resultSet.getString("phone"));
		chef.setPersonalUrl(resultSet.getString("personal_url"));
		chef.setLocationId(resultSet.getInt("location_id"));
		chef.setExperience(resultSet.getString("experience"));
		chef.setEmployerName(resultSet.getString("employer_name"));
		chef.setChefPassword(resultSet.getString("chef_password"));
		chef.setChefId(resultSet.getInt("chef_id"));
		chef.setAvailableDay(resultSet.getString("available_day"));
		chef.setAccount(resultSet.getString("account"));
		chef.setApprovedManager(resultSet.getInt("approved_manager"));
		chef.setApprovedTime(resultSet.getString("approved_time"));
		chef.setPersonalDetails(resultSet.getString("personal_details"));
		chef.setIsApproved(resultSet.getString("is_approved"));
		chef.setTrueName(resultSet.getString("true_name"));
		chef.setFirstName(resultSet.getString("first_name"));
		chef.setLastName(resultSet.getString("last_name"));
		return chef;
	}

}
