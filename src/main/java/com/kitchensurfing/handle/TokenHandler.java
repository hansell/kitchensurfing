package com.kitchensurfing.handle;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.kitchensurfing.common.AppConstants;
/**
 * @category handle
 * @author Hansel
 * @time June 2014 
 */
public class TokenHandler implements Serializable {

	private static Logger logger=Logger.getLogger(TokenHandler.class);
	private static final long serialVersionUID = 1L;
	private static Map<String,String> 
	springmvc_token=new HashMap<String,String>();
	//create a uniqe token
	@SuppressWarnings("unchecked")
	public synchronized static String generateGUID(HttpSession session){
		String token="";
		try{
			Object obj=session.getAttribute("SPIRNGMVC.TOKEN");
			if(obj==null){
				springmvc_token=(Map<String, String>) session.getAttribute("SPRINGMVC.TOKEN");
				token=new BigInteger(165,new Random()).toString(36).toUpperCase();
				springmvc_token.put(AppConstants.DEFAULT_TOKEN_NAME, token);
				session.setAttribute("SPRINGMVC.TOKEN", springmvc_token);
				AppConstants.TOKEN_VALUE="token";
			}
		}catch(IllegalStateException e){
			e.printStackTrace();
			logger.error("generateGUID method find bug by token session....");
		}catch(Exception e){
			e.printStackTrace();
			logger.error("A fatel exception....");
		}
		return token;
	}
	//验证表单token值和session中的token值是否一致
	public static boolean validToken(HttpServletRequest request){
		String inputToken=getInputToken(request);
		if(inputToken==null){
			logger.warn("token is not valid!input token is NUll");
			return false;
		}
		HttpSession session=request.getSession();
		@SuppressWarnings("unchecked")
		Map<String, String> tokenMap = (Map<String, String>)session.getAttribute("SPRINGMVC.TOKEN");
		if (tokenMap == null || tokenMap.size() < 1) {
			logger.warn("token is not valid!sessionToken is NULL");
			return false;
		}
		String sessionToken = tokenMap.get(AppConstants.DEFAULT_TOKEN_NAME + "."
				+ inputToken);
		if (!inputToken.equals(sessionToken)) {
			logger.warn("token is not valid!input Token='" + inputToken
					+ "',sessionToken = '" + sessionToken + "'");
			return false;
		}
		tokenMap.remove(AppConstants.DEFAULT_TOKEN_NAME + "." + inputToken);
		session.setAttribute("SPRINGMVC.TOKEN", tokenMap);
		return true;
	}
	//获取表单中token值
	public static String getInputToken(HttpServletRequest request){
		Map params=request.getParameterMap();
		if(!params.containsKey(AppConstants.DEFAULT_TOKEN_NAME)){
			logger.warn("Could not find token name in params");
			return null;

		}
		String[] tokens=(String[]) params.get(AppConstants.DEFAULT_TOKEN_NAME);
		if(tokens==null || tokens.length<1){
			logger.warn("Got a null or empty token name");
			return null;
		}
		return tokens[0];
	}
}
