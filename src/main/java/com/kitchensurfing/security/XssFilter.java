package com.kitchensurfing.security;

import java.io.IOException;
import java.io.Serializable;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
/**
 * @time 2014-6-10
 * @author Hansel
 * @description forCross Site Script attack
 */
public class XssFilter  implements Serializable,Filter {

	/**
	 * 
	 */
	private static final Logger logger=Logger.getLogger(XssFilter.class);
	private static final long serialVersionUID = 1L;
	FilterConfig filterConfig=null;
	public void destroy() {
		// TODO Auto-generated method stub
		this.filterConfig=null;
	}
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		try{
			logger.info("Xss filter has already on");
			chain.doFilter( new XssHttpServletRequestWrapper(
					(HttpServletRequest)request), response);
		}catch(Exception e){
			e.printStackTrace();
			if (!(e instanceof java.net.SocketException)) {
				if (request instanceof HttpServletRequest)
					logger.error("error request uri:"
							+ ((HttpServletRequest) request).getRequestURI());
				e.printStackTrace();
				logger.error(e);
			}
		}
	}
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		this.filterConfig=arg0;
		logger.info("Cross Site Script Filter init successfully");
	}

}
