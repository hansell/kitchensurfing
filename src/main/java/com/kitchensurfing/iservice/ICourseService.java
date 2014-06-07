package com.kitchensurfing.iservice;

import java.util.List;

import com.kitchensurfing.po.Course;

public interface ICourseService {
  List<Course> getList(final int chefId);
}
