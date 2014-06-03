package com.kitchensurfing.idaoimpl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kitchensurfing.config.core.KitchenSuringServiceConfig;
import com.kitchensurfing.po.Cuisine;

public class CuisineDaoImplTest {
	private static CuisineDaoImpl ds;
	@Before
	public void setUp() throws Exception {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				KitchenSuringServiceConfig.class);
		ds = ctx.getBean(CuisineDaoImpl.class);
	}

	@Test
	public void test() {
		//by id
	Cuisine cuisine=ds.getCuisine(1);
	System.out.println(cuisine.getCuisineName());
    //--by name
	Cuisine cuisines=ds.fetchCuisine("shanghai_cuisine");
	System.out.println(cuisines.getCuisineName());
	}
   @Test
   public void testGetRowCount(){
	   assertTrue(ds.getRowCount()==3);
   }
   @Test
   public void getQueryAllCuisine()
   {
	   for(Cuisine sine:ds.queryAllCuisine())
		   System.out.println(sine.getCuisineName());
   }
   @Test
   public void testgetCusineByChefId(){
	   List<Cuisine> list=ds.getCuisineByChefId(2);
	   for(Cuisine c:list)
		   System.out.println(c.getCuisineName());
   }
}
