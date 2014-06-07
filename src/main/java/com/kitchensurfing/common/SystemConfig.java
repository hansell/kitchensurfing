package com.kitchensurfing.common;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class SystemConfig implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//site config
	private static SiteConfig siteConfig;

	private static final Map<String, String> config = new HashMap<String, String>();

	public static Map<String, String> EXTEND_TYPE = new HashMap<String, String>(); 

	public static String ROOT_DIR = "";

	class SiteConfig{

	}
}
