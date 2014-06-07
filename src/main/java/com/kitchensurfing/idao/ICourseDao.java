package com.kitchensurfing.idao;

import java.util.List;

import com.kitchensurfing.po.Course;

public interface ICourseDao {
 Course getCourse(int courseId);
 List<Course> getList(final int chefId);
}
