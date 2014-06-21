package com.kitchensurfing.security;

import java.io.Serializable;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class TimeAccessInterceptor extends HandlerInterceptorAdapter  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    protected static final Logger logger=Logger.getLogger(TimeAccessInterceptor.class);
}
