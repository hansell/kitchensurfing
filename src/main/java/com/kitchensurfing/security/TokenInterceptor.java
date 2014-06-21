package com.kitchensurfing.security;

import java.io.Serializable;


import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.kitchensurfing.annotation.AvoidDuplicate;

public class TokenInterceptor extends HandlerInterceptorAdapter implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Logger logger=Logger.getLogger(TokenInterceptor.class);
	static{
		System.out.println("+we++");
	}
	  public boolean preHandle(HttpServletRequest request,
		            HttpServletResponse response, Object handler) {
		HandlerMethod handlerMethod=(HandlerMethod) handler;
		Method method=handlerMethod.getMethod();
		AvoidDuplicate annotation=method.getAnnotation(AvoidDuplicate.class);
		System.out.println("++++++++++++++++++++++++++");
		if(annotation !=null){
			boolean needSaveSession=annotation.saveToken();
			if(needSaveSession){
				//request.getSession(false)：若存在会话则返回该会话，否则返回NULL
				request.getSession(false).setAttribute("token", TokenProcessor.getInstance().generateToken(request));
			System.out.println(TokenProcessor.getInstance().generateToken(request)+"-------------------");
			}
			boolean needRemoreSession=annotation.removeToken();
			if(needRemoreSession){
				if(isRepeatSubmit(request)){
					logger.warn("please don't repeat submit,");
					return false;
				}
				request.getSession(false).removeAttribute("token");
			}
		}
		return true;
	}
   private boolean isRepeatSubmit(HttpServletRequest request){
	   String serverToken=(String) request.getSession(false).getAttribute("token");
	   if(serverToken == null){
		   return true;
	   }
	   String clientToken=request.getParameter("token");
	   if(clientToken == null){
		   return true;
	   }
	   if(!serverToken.equals(clientToken)){
		   return true;
	   }
	   return false;
   }
}
