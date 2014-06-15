package com.kitchensurfing.security;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.kitchensurfing.config.util.Globals;
/**
 * TokenProcessor is responsible for handling all token related functionality.  The 
32   * methods in this class are synchronized to protect token processing from multiple
33   * threads.  Servlet containers are allowed to return a different HttpSession object
34   * for two threads accessing the same session so it is not possible to synchronize 
35   * on the session.

 * @author Hansel
 *@time June 13
 */
public class TokenProcessor implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 *  The singleton instance of this class.
	 */
	private static TokenProcessor instance=new TokenProcessor();
	/**
	 *  Retrieves the singleton instance of this class.
	 */
	public static TokenProcessor getInstance(){
		return instance;
	}
	protected TokenProcessor(){
		super();
	}
	//The timestamp used most recently to generate a token value
	private Long previous;
	public synchronized boolean isTokenValid(HttpServletRequest request){
		return this.isTokenValid(request,false);
	}
	public synchronized boolean isTokenValid(HttpServletRequest request,boolean reset){
		// Retrieve the current session for this request
		HttpSession session = request.getSession(false);
		if(session==null){
			return false;
		}
		String saved = (String) session.getAttribute(Globals.TRANSACTION_TOKEN_KEY);
		if(saved==null){
			return false;
		}
		if(reset){
			this.resetToken(request);
		}
		// Retrieve the transaction token included in this request
		String token=request.getParameter(Globals.TOKEN_KEY);
		if(token==null){
			return false;
		}
		return saved.equals(token);

	}
	public synchronized void resetToken(HttpServletRequest request){
		HttpSession session=request.getSession(false);
		if(session==null){
			return;
		}
		session.removeAttribute(Globals.TRANSACTION_TOKEN_KEY);
	}
	public synchronized void saveToken(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String token = generateToken(request);
		if(token!=null){
			session.setAttribute(Globals.TRANSACTION_TOKEN_KEY, token);
		}
	}
	/**
	 * Generate a new transaction token, to be used for enforcing a single
	 * request for a particular transaction.
	 */
	public synchronized String generateToken(HttpServletRequest request){
		HttpSession session=request.getSession();
		try{
			byte id[]=session.getId().getBytes();
			long current=System.currentTimeMillis();
			if(current==previous){
				current++;
			}
			previous=current;
			byte now[]=new Long(current).toString().getBytes();
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			messageDigest.update(id);
			messageDigest.update(now);
			return toHex(messageDigest.digest());
		}catch(NoSuchAlgorithmException e){
			e.printStackTrace();
			return null;
		}
	}
	//Convert a byte array to a String of hexadecimal digits and return it.
	private String toHex(byte buffer[]){
		StringBuffer sb=new StringBuffer(buffer.length*2);
		for(int i=0;i<buffer.length;i++){
			sb.append(Character.forDigit((buffer[i] & 0xf0) >> 4, 16));
			sb.append(Character.forDigit(buffer[i] & 0x0f, 16));
		}
		return sb.toString();
	}
}
