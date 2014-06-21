package com.kitchensurfing.security;

import java.io.Serializable;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
/**
 * 
 * @author Hansel
 *Intercept before the controller execution, check if the current time is in between the maintenance time, 
 *if yes then redirect it to maintenance page; else continue the execution chain.
 */
public class MaintenanceInterceptor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    protected static final Logger logger=Logger.getLogger(MaintenanceInterceptor.class);
    private int maintenanceStartTime;
	private int maintenanceEndTime;
	private String maintenanceMapping;
 
	public void setMaintenanceMapping(String maintenanceMapping) {
		this.maintenanceMapping = maintenanceMapping;
	}
 
	public void setMaintenanceStartTime(int maintenanceStartTime) {
		this.maintenanceStartTime = maintenanceStartTime;
	}
 
	public void setMaintenanceEndTime(int maintenanceEndTime) {
		this.maintenanceEndTime = maintenanceEndTime;
	}
 
	//before the actual handler will be executed
	public boolean preHandle(HttpServletRequest request, 
			HttpServletResponse response, Object handler)
	    throws Exception {
 
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(cal.HOUR_OF_DAY);
 
		if (hour >= maintenanceStartTime && hour <= maintenanceEndTime) {
			//maintenance time, send to maintenance page
			response.sendRedirect(maintenanceMapping);
			return false;
		} else {
			return true;
		}
 
	}

}
