package com.kitchensurfing.tagsupport;

import java.io.IOException;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import org.springframework.web.context.WebApplicationContext;

import com.kitchensurfing.config.util.KitchenSurfingInit;
import com.kitchensurfing.idaoimpl.LocationDaoImpl;
import com.kitchensurfing.po.Location;

public class CityLocationTag extends SimpleTagSupport {

	@Override
	public void doTag() throws JspException, IOException {
		
		 WebApplicationContext applicationcontext=KitchenSurfingInit.getWebApplicationContext();
		  
		 LocationDaoImpl locationdao=(LocationDaoImpl)applicationcontext.getBean("LocationDaoImpl");
	
		 List<Location> locations=locationdao.getLocation();
		 
		 JspWriter writer=getJspContext().getOut();
		 
		 for(Location  location : locations)
		 {
			 writer.write("<div>"+location.getLocationName()+"</div>");
		 }
		 
	  //   getJspContext().getOut().write("hellow tag!!!");
	
	}

	
	
	
}
