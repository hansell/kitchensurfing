package com.kitchensurfing.idaoimpl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kitchensurfing.config.core.KitchenSuringServiceConfig;
import com.kitchensurfing.po.Chef;

public class ChefDaoImplTest {

	private static ChefDaoImpl ds;
	@Before
	public void setUp() throws Exception {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				KitchenSuringServiceConfig.class);
		ds = ctx.getBean(ChefDaoImpl.class);
		ctx.close();
	}


	@Test
	public void test() {
		Chef chef=ds.getChef(1);
		System.out.println(chef.getAccount());
	}
   @Test
   public void testList(){
	   List<Chef> chefs=ds.chefList(1);
	   System.out.println(chefs.size());
	   for(Chef chef:chefs)
		   System.out.println(chef.getAccount());
   }
}
