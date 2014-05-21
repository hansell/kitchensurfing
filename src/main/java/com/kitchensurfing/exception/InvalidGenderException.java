package com.kitchensurfing.exception;

/** 
 * the class with the user made the gender exception
 */
public class InvalidGenderException  extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 String msg;
	    int num;

	     public InvalidGenderException() 
	     {
	         super();
	     }

	     public InvalidGenderException(String msg) 
	     {
	         super();
	         this.msg = msg;
	     }
	     public InvalidGenderException(int num) 
	     {
	         super();
	         this.num = num;
	     }
}
