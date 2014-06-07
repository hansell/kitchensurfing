package com.kitchensurfing.common;

import java.io.Serializable;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
 * md5 encode
 * @author Hansel
 *
 */
public class MD5MessageDigest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static String Md5Encode(String args) throws NoSuchAlgorithmException{
		MessageDigest messageDigest = MessageDigest.getInstance("MD5");  
		messageDigest.update(args.getBytes(),0, args.length());  
		String hashedPass = new BigInteger(1,messageDigest.digest()).toString(16);  
		if (hashedPass.length() < 32) {
		   hashedPass = "0" + hashedPass; 
		}
		return hashedPass;
	}

}
