package com.kitchensurfing.config.util;

import java.io.Serializable;
/**
 * Global manifest constants for the entire  System. 
 * @author Hansel
 *
 */
public class Globals implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String CANCEL_KEY="org.kitchensurfing.action.CANCEL";

	public static final String MODULE_KEY = "org.kitchensurfing.action.MODULE";
	public static final String DATA_SOURCE_KEY =
			"org.kitchensurfing.action.DATA_SOURCE";
	public static final String ERROR_KEY =
			"org.kitchensurfing.action.ERROR";

	public static final String LOCALE_KEY =
			"org.kitchensurfing.action.LOCALE";

	public static final String MAPPINGS_KEY =
			"org.kitchensurfing.action.MAPPINGS";

	public static final String MESSAGE_KEY =
			"org.kitchensurfing.action.ACTION_MESSAGE";

	public static final String SERVLET_KEY =
			"org.kitchensurfing.action.SERVLET_MAPPING";

	//The session attributes key under which our transaction token is stored, if it is used.
	public static final String TRANSACTION_TOKEN_KEY =
			"org.kitchensurfing.action.TOKEN";
   public static final String TOKEN_KEY="org.kitchensurfing.springmvc.Tokens";
}
