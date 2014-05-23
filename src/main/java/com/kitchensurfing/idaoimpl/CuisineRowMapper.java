package com.kitchensurfing.idaoimpl;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.kitchensurfing.po.Cuisine;

/**
 *  @description the rowMapper of cuisine
 * @author Hansel
 *
 */
public class CuisineRowMapper implements Serializable, RowMapper<Cuisine>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Cuisine mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
		// TODO Auto-generated method stub
		Cuisine cuisine=new Cuisine();
		cuisine.setCuisineId(resultSet.getInt("cuisine_id"));
		cuisine.setCuisineName(resultSet.getString("cuisine_name"));
		cuisine.setDescription(resultSet.getString("description"));
		cuisine.setMenuId(resultSet.getInt("menu_id"));
		cuisine.setStatused(resultSet.getString("statused"));
		return cuisine;
	}

}
