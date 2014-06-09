package com.kitchensurfing.control;

import java.io.IOException;
import java.io.Serializable;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kitchensurfing.exception.CustomGenericException;


public class MainController implements Serializable {

	public MainController(){
		
	}
	private static final long serialVersionUID = 5813190448518394223L;
    @RequestMapping(value="/{type:.+}",method=RequestMethod.GET)
	public String getPages(@PathVariable("type") String type) throws Exception{
    	if("error".equals(type)){
    		throw new CustomGenericException("E888", "This is custom message");
    	}else if("io-error".equals(type)) {
    		throw new IOException();
    	}else{
    		return type;
    	}
    }
    @ExceptionHandler(CustomGenericException.class)
	public ModelAndView handleCustomException(CustomGenericException ex) {
 
		ModelAndView model = new ModelAndView("error/generic_error");
		model.addObject("errCode", ex.getErrCode());
		model.addObject("errMsg", ex.getErrMsg());
 
		return model;
 
	}
 
	@ExceptionHandler(Exception.class)
	public ModelAndView handleAllException(Exception ex) {
 
		ModelAndView model = new ModelAndView("error/generic_error");
		model.addObject("errMsg", "this is Exception.class");
 
		return model;
 
	}

}
