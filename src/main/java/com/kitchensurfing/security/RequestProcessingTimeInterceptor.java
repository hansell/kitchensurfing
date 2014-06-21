package com.kitchensurfing.security;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class RequestProcessingTimeInterceptor extends HandlerInterceptorAdapter
implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger logger=Logger.
			getLogger(RequestProcessingTimeInterceptor.class);
	//before the actual handler will be executed
	public boolean preHandle(HttpServletRequest request, 
			HttpServletResponse response, Object handler)
					throws Exception {

		long startTime = System.currentTimeMillis();
		request.setAttribute("startTime", startTime);
        System.out.println(startTime+"------");
		return true;
	}

	//after the handler is executed
	public void postHandle(
			HttpServletRequest request, HttpServletResponse response, 
			Object handler, ModelAndView modelAndView)
					throws Exception {

		long startTime = (Long)request.getAttribute("startTime");

		long endTime = System.currentTimeMillis();

		long executeTime = endTime - startTime;

		//modified the exisitng modelAndView
		modelAndView.addObject("executeTime",executeTime);

		//log it
		if(logger.isDebugEnabled()){
			logger.debug("[" + handler + "] executeTime : " + executeTime + "ms");
		}
	}
  public void afterCompletion(
		  HttpServletRequest request, HttpServletResponse response, Object handle,Exception e) throws Exception{
	  System.out.println("it's after");
  }
}
