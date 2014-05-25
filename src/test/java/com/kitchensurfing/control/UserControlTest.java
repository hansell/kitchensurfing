package com.kitchensurfing.control;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.kitchensurfing.iservice.IUserService;
import com.kitchensurfing.serviceimpl.UserService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={TestContext.class,WebApplicationContext.class})
@WebAppConfiguration
public class UserControlTest {
   private MockMvc mockMvc;
   
   @Autowired
   private WebApplicationContext ctx;
	@Before
	public void setUp() throws Exception {
		/* InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
	        viewResolver.setPrefix("/WEB-INF/jsp/view/");
	        viewResolver.setSuffix(".jsp");

	        mockMvc = MockMvcBuilders.standaloneSetup()
	                                 .setViewResolvers(viewResolver)
	                                 .build();*/
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
