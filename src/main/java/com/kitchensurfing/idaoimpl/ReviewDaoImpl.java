package com.kitchensurfing.idaoimpl;

import java.io.Serializable;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kitchensurfing.exception.SQLErrorCodesTranslator;
import com.kitchensurfing.idao.IReviewDao;
import com.kitchensurfing.po.Review;
@Repository
public class ReviewDaoImpl implements Serializable, IReviewDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JdbcTemplate jdbcTemplate;
	@Autowired
	public void init(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		 // create a custom translator and set the DataSource for the default translation lookup
		SQLErrorCodesTranslator tr = new SQLErrorCodesTranslator();
		    tr.setDataSource(dataSource);
		    this.jdbcTemplate.setExceptionTranslator(tr);
	}
	public Review getReview(final int reviewId) {
		// TODO Auto-generated method stub
		String sql="select * from ks_review r where r.review_id=?";
		return this.jdbcTemplate.queryForObject(sql, new Object[]{reviewId}, 
				new ReviewRowMapper());
	}
	@SuppressWarnings("deprecation")
	public int getReviewCount(int userId) {
		// TODO Auto-generated method stub
		String sql="select count(*) from ks_review r where r.user_id=?";
		return this.jdbcTemplate.queryForInt(sql, new Object[]{userId});
	}

}
