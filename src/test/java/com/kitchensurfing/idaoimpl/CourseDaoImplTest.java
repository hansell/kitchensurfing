package com.kitchensurfing.idaoimpl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kitchensurfing.config.core.KitchenSuringServiceConfig;
import com.kitchensurfing.po.Course;

public class CourseDaoImplTest {

	private static CourseDaoImpl ds;
	@Before
	public void setUp() throws Exception {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				KitchenSuringServiceConfig.class);
		ds = ctx.getBean(CourseDaoImpl.class);
	}


	@Test
	public void test() {
		Course course=ds.getCourse(1);
		System.out.println(course.getCourseTitle());
	}

}
