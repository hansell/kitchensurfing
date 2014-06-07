package com.kitchensurfing.control;

import java.io.Serializable;
import java.util.List;
import java.util.regex.PatternSyntaxException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kitchensurfing.common.AppConstants;
import com.kitchensurfing.exception.InvalidCityException;
import com.kitchensurfing.iservice.IChefService;
import com.kitchensurfing.iservice.ILocationService;
import com.kitchensurfing.po.Chef;
import com.kitchensurfing.po.Location;


/**
 * @time June 2014
 * @author Hansel
 * @description restful API RequestMapping
 */
public class LocationMappingController implements Serializable {

	private static Logger logger=Logger.getLogger(LocationMappingController.class);
	private static final long serialVersionUID = 1L;
	@Autowired
	private ILocationService cityservice;
	@Autowired
	private IChefService chefHelp;
	//RequestMapping with Path Variables 
	@RequestMapping(value="/map/{params}",method=RequestMethod.GET)
	@ResponseBody
	public String viewMenu(HttpServletRequest request,
			HttpServletResponse response,@PathVariable("params") String params){
		try{
			String[] values=params.split("-");
			int i=values.length;
			if(i<1){
				throw new IllegalArgumentException();
			}
			String city=values[i-1].trim().toLowerCase();
			if(!AppConstants.cities.contains(city)){
				throw new InvalidCityException();
			}
			Location location=cityservice.fetchLocation(city);
			List<Chef> chefList=chefHelp.chefs(location.getLocationId());
			
		}catch(PatternSyntaxException e){
			logger.error("invalid pattern regex input");
			e.printStackTrace();
		}
		return params;
	}
}
