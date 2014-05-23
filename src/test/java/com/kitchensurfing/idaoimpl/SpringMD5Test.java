package com.kitchensurfing.idaoimpl;

import static org.junit.Assert.*;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.junit.Before;
import org.junit.Test;
import org.springframework.security.providers.encoding.Md5PasswordEncoder;
public class SpringMD5Test {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() throws NoSuchAlgorithmException {
		MessageDigest messageDigest = MessageDigest.getInstance("MD5");  
		messageDigest.update("666666".getBytes(),0, "666666".length());  
		String hashedPass = new BigInteger(1,messageDigest.digest()).toString(16);  
		if (hashedPass.length() < 32) {
		   hashedPass = "0" + hashedPass; 
		}
		System.out.println(hashedPass);
	}

}
