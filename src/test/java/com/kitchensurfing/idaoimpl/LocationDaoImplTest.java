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
		System.out.println(l.getLocationCreateDate()+"----"+l.getLocationName()+l.getLocationEnglishCode());
		//--test by name

		Location ld=ds.getLocation("shanghai");
		System.out.println(ld.getLocationCreateDate()+"----"+ld.getLocationName()+ld.getLocationEnglishCode());
	}
	@Test
	public void testGetRowCount(){
		assertTrue(ds.getRowCount()==1);
	}
	@Test
	public void testGetList(){
    for(Location l:ds.getLocation())
    	System.out.println(l.getLocationCreateDate()+"----"+l.getLocationName()+l.getLocationEnglishCode());
     assertTrue(ds.getLocation().size()==1);
	}
}
