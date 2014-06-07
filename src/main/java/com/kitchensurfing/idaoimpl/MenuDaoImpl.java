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

import com.kitchensurfing.idao.IMenuDao;
import com.kitchensurfing.po.Menu;
@Repository
public class MenuDaoImpl  extends BaseDaoImpl implements Serializable, IMenuDao {


	private static final long serialVersionUID = 1L;
	

	public Menu getMenu(final int id) {
		// TODO Auto-generated method stub
		String sql="select * from ks_menu m where m.menu_id=?";
		List<Menu> list=this.jdbcTemplate.query(sql, new PreparedStatementSetter(){
			public void setValues(PreparedStatement arg0) throws SQLException {
				// TODO Auto-generated method stub
				arg0.setInt(1, id);
			}}, new MenuRowMapper());
		if(list.size()>0)
			return list.get(0);
		else
			return null;
	}

	public List<Menu> getMenuList(final int chefId) {
		// TODO Auto-generated method stub
		String sql="select * from ks_menu m where m.chef_id=?";
		return this.jdbcTemplate.query(sql, new PreparedStatementSetter(){
			public void setValues(PreparedStatement arg0) throws SQLException {
				// TODO Auto-generated method stub
				arg0.setInt(1, chefId);
			}}, new MenuRowMapper());
		
	}

}
