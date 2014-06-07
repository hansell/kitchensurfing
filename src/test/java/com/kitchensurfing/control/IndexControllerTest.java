package com.kitchensurfing.control;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.InjectMocks;


import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.kitchensurfing.po.User;
import com.kitchensurfing.serviceimpl.UserService;

public class IndexControllerTest {

	@Mock
	private UserService userService;
	@InjectMocks
	private IndexController indexController;
	private MockMvc mockMvc;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		 // Process mock annotations
        MockitoAnnotations.initMocks(this);
	}

	@Test
	public void test() {
		fail("Not yet implemented");
		 // Setup Spring test in standalone mode
        this.mockMvc = MockMvcBuilders.standaloneSetup(indexController).build();
	}
	@Test
	public void testCreateSignupFormInvalidUser() throws Exception {
		
		
	}
}
