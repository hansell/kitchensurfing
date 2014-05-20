package com.kitchensurfing.serviceimpl.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kitchensurfing.config.core.KitchenSuringServiceConfig;
import com.kitchensurfing.serviceimpl.UserService;

public class UserServiceTester {
   private static UserService iUserService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		   // one-time initialization code   
					@SuppressWarnings("resource")
					AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
							KitchenSuringServiceConfig.class);
					iUserService=	ctx.getBean(UserService.class);
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(iUserService.logIn("9191830052@qq.com","i love you 520"));
	}

}
