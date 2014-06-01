package com.kitchensurfing.idaoimpl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kitchensurfing.config.core.KitchenSuringServiceConfig;
import com.kitchensurfing.po.Menu;

public class MenuDaoImplTest {

	private static MenuDaoImpl ds;
	@Before
	public void setUp() throws Exception {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				KitchenSuringServiceConfig.class);
		ds = ctx.getBean(MenuDaoImpl.class);
		ctx.close();
	}

	@Test
	public void test() {
		Menu menu=ds.getMenu(1);
		System.out.println(menu.getChefId());
		List<Menu> menus=ds.getMenuList(1);
		System.out.println(menus.size());
	}

}
