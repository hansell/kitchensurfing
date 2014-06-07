package com.kitchensurfing.idaoimpl;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import com.kitchensurfing.exception.SQLErrorCodesTranslator;
import com.kitchensurfing.idao.IStyleDao;
import com.kitchensurfing.po.Style;
@Repository
public class StyleDaoImpl  extends BaseDaoImpl implements Serializable, IStyleDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Style getStyle(int id) {
		// TODO Auto-generated method stub
		String sql="select * from ks_style_service ss where ss.style_service_id=?";
		return this.jdbcTemplate.queryForObject(sql,new Object[]{id}, new StyleRowMapper());
	}

	public List<Style> getLists(final int menuId) {
		// TODO Auto-generated method stub
		return this.jdbcTemplate.query("select * from ks_style_service ss where ss.menu_id=?",
				 new PreparedStatementSetter(){

					public void setValues(PreparedStatement arg0)
							throws SQLException {
						// TODO Auto-generated method stub
						arg0.setInt(1,menuId);
					}}, 
				new StyleRowMapper());
	}

}
