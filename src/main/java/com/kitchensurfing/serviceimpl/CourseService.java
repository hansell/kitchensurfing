package com.kitchensurfing.serviceimpl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.kitchensurfing.idao.ICourseDao;
import com.kitchensurfing.iservice.ICourseService;
import com.kitchensurfing.po.Course;
/**
 * @time create at 2014-05-30
 * @author Hansel
 *
 */
@Repository
@Service("courseService")
public class CourseService implements Serializable, ICourseService {

	private static final long serialVersionUID = 1L;
	@Autowired
	private ICourseDao courseDao;
	public List<Course> getList(final int chefId) {
		// TODO Auto-generated method stub
		return courseDao.getList(chefId);
	}

}
