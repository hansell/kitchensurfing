package com.kitchensurfing.exception;

import java.io.Serializable;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;


public class ErrorExceptionResolver implements Serializable,HandlerExceptionResolver  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public HandlerExceptionResolver handlerExceptionResolver() {

		SimpleMappingExceptionResolver exceptionResolver = new SimpleMappingExceptionResolver();

		exceptionResolver.setDefaultErrorView("uncaughtException");

		Properties mappings = new Properties();

		mappings.put(".DataAccessException", "dataAccessFailure");

		mappings.put(".NoSuchRequestHandlingMethodException", "resourceNotFound");

		mappings.put(".TypeMismatchException", "resourceNotFound");

		mappings.put(".MissingServletRequestParameterException", "resourceNotFound");

		exceptionResolver.setExceptionMappings(mappings );

		return exceptionResolver;
	}
	public ModelAndView resolveException(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex) {
		// TODO Auto-generated method stub
		return null;
	}

}
