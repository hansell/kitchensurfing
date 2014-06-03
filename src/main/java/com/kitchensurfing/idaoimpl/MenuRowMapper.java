package com.kitchensurfing.idaoimpl;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.kitchensurfing.po.Menu;
import org.springframework.jdbc.core.RowMapper;
public class MenuRowMapper implements Serializable,RowMapper<Menu>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Menu mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Menu menu=new Menu();
		menu.setChefId(rs.getInt("chef_id"));
		menu.setDescription(rs.getString("description"));
		menu.setMaximumChargePerPerson(rs.getString("maximum_charge_per_person"));
		menu.setMaximunPerson(rs.getString("maximum_person"));
		menu.setMenuCreateDate(rs.getString("menu_create_date"));
		menu.setMenuId(rs.getInt("menu_id"));
		menu.setStatused(rs.getString("statused"));
		menu.setMinimumHour(rs.getString("minimum_hour"));
		menu.setMinimumPerson(rs.getString("minimum_person"));
		menu.setTitle(rs.getString("title"));
		menu.setRank(rs.getString("rank"));
		menu.setIsCheck(rs.getString("is_check"));
		return menu;
	}

}
