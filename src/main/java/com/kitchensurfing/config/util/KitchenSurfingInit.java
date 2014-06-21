package com.kitchensurfing.config.util;



import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class KitchenSurfingInit implements ServletContextListener {
	
	public  static  Log log=LogFactory.getLog(KitchenSurfingInit.class);
	
    private  static  WebApplicationContext  kitchenContext;
	
	public void contextDestroyed(ServletContextEvent servletevent) {
		log.info("servlet context  destory!!!!!");
	}

	//初始化上下文对象
	public void contextInitialized(ServletContextEvent servletevent) {
		
		kitchenContext=WebApplicationContextUtils.getWebApplicationContext(servletevent.getServletContext());
		log.info("servlet context  init!!!!!");
	
	}
    /**
     * 获取容器上下文对象
     * @return
     */
    public static WebApplicationContext getWebApplicationContext()
    {
    	return kitchenContext;
    }

	
	

}
