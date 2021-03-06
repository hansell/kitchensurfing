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
import com.kitchensurfing.idao.IChefDao;
import com.kitchensurfing.po.Chef;

@Repository
public class ChefDaoImpl extends BaseDaoImpl implements Serializable, IChefDao {

	private static final long serialVersionUID = 7538675731733454778L;

	public Chef getChef(final int chefId) {
		// TODO Auto-generated method stub
		String sql = "select * from ks_chef c where c.chef_id=?";
		return jdbcTemplate.queryForObject(sql, new Object[] { chefId },
				new ChefRowMapper());
	}

	public Chef getChef(String email, String name) {
		// TODO Auto-generated method stub
		String sql = "select * from ks_chef c where c.account=? and c.true_name=?";
		return this.jdbcTemplate.queryForObject(sql,
				new Object[] { email, name }, new ChefRowMapper());
	}

	public List<Chef> chefList(final int cityId) {
		// TODO Auto-generated method stub
		String sql = "select * from ks_chef c where c.location_id=?";
		return this.jdbcTemplate.query(sql, new PreparedStatementSetter() {

			public void setValues(PreparedStatement arg0) throws SQLException {
				// TODO Auto-generated method stub
				arg0.setInt(1, cityId);
			}
		}, new ChefRowMapper());
	}
    /**
     * 更新厨师基础信息
     */
	public int updateChefBase(Chef chefbase) {
		String sql = "update ks_chef  set  tag_line=?,cookstyle=?,favoringredientone=?,favoringredienttwo=?,favoringredientthree=?"
				+ ", personalkey=?,personalspecial=?,weblocationone=?,weblocationtwo=?,weblocationthree=?  where  user_id=?";

		return this.jdbcTemplate.update(sql,chefbase.getTagLine(), chefbase.getCookstyle(),
				chefbase.getFavoringredientone(),
				chefbase.getFavoringredienttwo(),
				chefbase.getFavoringredientthree(), chefbase.getPersonalkey(),
				chefbase.getPersonalspecial(),chefbase.getWeblocationone(),chefbase.getWeblocationtwo(),chefbase.getWeblocationthree(),Integer.valueOf(chefbase.getUserid()));

	}

	public Chef getChefByUserid(int userid) {
		String sql = "select * from ks_chef c where c.user_id=?";
		return jdbcTemplate.queryForObject(sql, new Object[] { userid },
				new ChefRowMapper());
	}
	

}
