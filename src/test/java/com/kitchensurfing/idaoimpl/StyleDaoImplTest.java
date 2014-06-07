package com.kitchensurfing.idaoimpl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kitchensurfing.config.core.KitchenSuringServiceConfig;
import com.kitchensurfing.po.Style;

public class StyleDaoImplTest {

	private static  StyleDaoImpl ds;
	@Before
	public void setUp() throws Exception {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				KitchenSuringServiceConfig.class);
		ds = ctx.getBean( StyleDaoImpl.class);
		ctx.close();
	}


	@Test
	public void test() {
		Style style=ds.getStyle(1);
		System.out.println(style.getStyleName());
	}
	@Test
	public void testList() {
		List<Style> list=ds.getLists(2);
		for(Style ss:list)
			System.out.println(ss.getDescription());
	}
}
