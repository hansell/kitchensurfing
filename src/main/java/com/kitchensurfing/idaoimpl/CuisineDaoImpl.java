package com.kitchensurfing.idaoimpl;

import java.io.Serializable;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kitchensurfing.exception.SQLErrorCodesTranslator;
import com.kitchensurfing.idao.ICuisineDao;
import com.kitchensurfing.po.Cuisine;
@Repository
public class CuisineDaoImpl  extends BaseDaoImpl implements Serializable, ICuisineDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Cuisine getCuisine(final int id) {
		// TODO Auto-generated method stub
		String sql="select * from ks_cuisine c where c.cuisine_id=?";
		return  this.jdbcTemplate.queryForObject(sql, new Object[]{id},new CuisineRowMapper());
		
	}

	public Cuisine fetchCuisine(final String name) {
		// TODO Auto-generated method stub
		String sql="select * from ks_cuisine c where c.description=?";
		return this.jdbcTemplate.queryForObject(sql,new Object[]{name}, new CuisineRowMapper());
	}

	public int getRowCount() {
		// TODO Auto-generated method stub
		String sql="select count(*) from ks_cuisine";
		return this.jdbcTemplate.queryForObject(sql, Integer.class);
	}

	public List<Cuisine> queryAllCuisine() {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM KS_CUISINE";
		return this.jdbcTemplate.query(sql, new CuisineRowMapper());
	}
	public List<Cuisine> getCuisineByChefId(int chefId) {
		// TODO Auto-generated method stub
		return  this.jdbcTemplate.query("select * from ks_cuisine c where c.menu_id=?"
			,new Object[]{chefId}	, new CuisineRowMapper());
	}

}
