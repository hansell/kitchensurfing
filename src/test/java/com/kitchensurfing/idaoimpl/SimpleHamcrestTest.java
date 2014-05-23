package com.kitchensurfing.idaoimpl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.hamcrest.Matchers.*; 
public class SimpleHamcrestTest {
    
	static  Simple simple=null;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		simple=new Simple();
		System.out.println("this is the first run --beforeclass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("this is the second run --before");
	}

	@Test
	public void testAdd() {
		int number=simple.add(1,2);
		//assertThat(number,allOf(greaterThan(1),lessThan(4)));
		  assertThat(number, anyOf(greaterThan(1), lessThan(1))); 
	}

}
