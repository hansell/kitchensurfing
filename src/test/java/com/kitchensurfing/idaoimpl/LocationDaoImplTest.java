package com.kitchensurfing.idaoimpl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kitchensurfing.config.core.KitchenSuringServiceConfig;
import com.kitchensurfing.po.Location;

public class LocationDaoImplTest {
	private static LocationDaoImpl ds;
	@Before
	public void setUp() throws Exception {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				KitchenSuringServiceConfig.class);
		ds = ctx.getBean(LocationDaoImpl.class);
	}

	@Test
	public void testGetLocation() {
		//----test by  id
		Location l=ds.getLocation(1);
		//--test by name

		Location ld=ds.getLocation("shanghai");
	}
	@Test
	public void testGetRowCount(){
		assertTrue(ds.getRowCount()==1);
	}
	@Test
	public void testGetList(){
    for(Location l:ds.getLocation())
     assertTrue(ds.getLocation().size()==1);
	}
}
