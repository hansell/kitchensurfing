package com.kitchensurfing.exception;

public class WordContainsException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public WordContainsException (){
	}

	public WordContainsException (String message){
		super (message);
	}

	public WordContainsException (Throwable cause){
		super (cause);
	}

	public WordContainsException (String message, Throwable cause){
		super (message, cause);
	}
}
