package com.kitchensurfing.security;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

import org.apache.log4j.Logger;

public class XssHttpServletRequestWrapper extends HttpServletRequestWrapper implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private static Logger logger=Logger.getLogger(XssHttpServletRequestWrapper.class);
	public XssHttpServletRequestWrapper(HttpServletRequest request) {
		super(request);
		// TODO Auto-generated constructor stub
		logger.info("it's a filter wrapper");
	}

	public String[] getParameterValues(String paramter){
		String[] values=super.getParameterValues(paramter);
		if(values==null){
			return null;
		}
		int count=values.length;
		String[] encodedValues=new String[count];
		for(int i=0;i<count;i++){
			  encodedValues[i] = cleanXSS(values[i]);
		}
		return encodedValues;
	}
   public String getParameter(String paramter){
	   String value=super.getParameter(paramter);
	   if(value==null){
		   return null;
	   }
	   return  cleanXSS(value);
   }
   public String getHeader(String name){
	   String value = super.getHeader(name);
       if (value == null)
           return null;
       return cleanXSS(value);
   }
   protected String cleanXSS( String value) {
	   //You'll need to remove the spaces from the html entities below
	   value = value.replaceAll("<", "& lt;").replaceAll(">", "& gt;");
       value = value.replaceAll("\\(", "& #40;").replaceAll("\\)", "& #41;");
       value = value.replaceAll("'", "& #39;");
       value = value.replaceAll("eval\\((.*)\\)", "");
       value = value.replaceAll("[\\\"\\\'][\\s]*javascript:(.*)[\\\"\\\']", "\"\"");
       value = value.replaceAll("script", "");
       return value;
   }
}
