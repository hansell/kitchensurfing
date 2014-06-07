package com.kitchensurfing.idaoimpl;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.kitchensurfing.po.Course;

public class CourseRowMapper implements Serializable,RowMapper<Course> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Course course=new Course();
		course.setCourseId(rs.getInt("course_id"));
		course.setCourseTitle(rs.getString("title"));
		course.setDescription(rs.getString("description"));
		course.setUserId(rs.getInt("user_id"));
		course.setStatused(rs.getString("statused"));
		return course;
	}

}
