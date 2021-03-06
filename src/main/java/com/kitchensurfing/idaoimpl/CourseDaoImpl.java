package com.kitchensurfing.idaoimpl;

import java.io.Serializable;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kitchensurfing.exception.SQLErrorCodesTranslator;
import com.kitchensurfing.idao.ICourseDao;
import com.kitchensurfing.po.Course;
@Repository
public class CourseDaoImpl  extends BaseDaoImpl implements Serializable, ICourseDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Course getCourse(int courseId) {
		// TODO Auto-generated method stub
		String sql="select * from ks_course co where co.course_id=?";
		return this.jdbcTemplate.queryForObject(sql,new Object[]{courseId},new CourseRowMapper());
	}
	public List<Course> getList(int chefId) {
		// TODO Auto-generated method stub
		String sql="select * from ks_course co where co.chef_id=?";
		return this.jdbcTemplate.query(sql, new Object[]{chefId}, new CourseRowMapper());
	}

}
