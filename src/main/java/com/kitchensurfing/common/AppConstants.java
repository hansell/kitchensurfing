package com.kitchensurfing.common;

import java.io.Serializable;

/**
 * The constants of kitchensurfing
 * @author Hansel
 *
 */
public class AppConstants implements Serializable{

	private static final long serialVersionUID = 1L;
	//SESSION constant
    public static String SESSION_USER_STRING="kitchensurfing_session_user";
	public final static String ENCRYPT_MD5 = "MD5";
	
	public final static int SALT_LENGTH = 2; 
	
	/**
	 * վ������
	 */
	public final static String SITE_CONFIG = "siteConfig";
	
	/**
	 * ϵͳ����
	 */
	public final static String SYSTEM_CONFIG = "systemConfig";
	
	/**
	 * ��¼�û�
	 */
	public final static String LOGIN_USER = "user";
    
    /**
	 * Cookie
	 */
    public static final String COOKIE_REMEMBERME_USER_USERNAME = "lovej.cookie.rememberme";  
    
    public static final String COOKIE_REMEMBERME_USER_PASSWORD = "lovej.cookie.rememberme";
    
    //7��
    public static final int COOKIE_REMEMBERME_TIME = 60 * 60 * 24 * 7;
    /**
     * operation
     */
    public static final String OPERATION = "operation";
    
    public static final String OPERATION_SUCCESS = "success";
    
    public static final String OPERATION_FAILURE = "failure";
}
