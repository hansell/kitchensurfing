package com.kitchensurfing.config.core;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class KitchenSurfingConfigTester {
	 Test myBean;
	@Before
	public void setUp() throws Exception {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext ctx =
			     new AnnotationConfigApplicationContext();
			 ctx.register(KitchenSuringConfig.class);
			 ctx.refresh();
			 myBean = ctx.getBean(Test.class);
           
	}

	@Test
	public void test() {
		
	}

}
