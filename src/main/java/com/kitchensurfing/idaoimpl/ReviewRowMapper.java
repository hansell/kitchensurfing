package com.kitchensurfing.idaoimpl;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.kitchensurfing.po.Review;

public class ReviewRowMapper implements Serializable,RowMapper<Review>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Review mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
		// TODO Auto-generated method stub
		Review review =new Review();
		review.setChefId(resultSet.getInt("chef_id"));
		review.setContent(resultSet.getString("content"));
		review.setDate(resultSet.getString("review_create_date"));
		review.setDescription(resultSet.getString("decription"));
		review.setNegative(resultSet.getString("negatived"));
		review.setPositive(resultSet.getString("positived"));
		review.setReviewId(resultSet.getInt("review_id"));
		review.setStatused(resultSet.getString("statused"));
		review.setUserId(resultSet.getInt("user_id"));
		return review;
	}

}
