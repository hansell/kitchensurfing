package com.kitchensurfing.idaoimpl;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.kitchensurfing.po.Style;

public class StyleRowMapper implements Serializable,RowMapper<Style>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Style mapRow(ResultSet arg0, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		Style style=new Style();
		style.setCode(arg0.getString("service_english_code"));
		style.setDescription(arg0.getString("description"));
		style.setMenuId(arg0.getInt("menu_id"));
		style.setStatused(arg0.getString("statused"));
		style.setStyleId(arg0.getInt("style_service_id"));
		style.setStyleName(arg0.getString("style_service_name"));
		return style;
	}

}
