package com.kitchensurfing.iservice;

import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpServletRequest;

import com.kitchensurfing.po.User;
import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;

/**
 * service of user's operation
 * @author Hansel
 *
 */
public interface IUserService {
    public boolean logIn(String account,String userPassword);
    public void logOut();
    public User getUser(String username);
    public User addUser(HttpServletRequest req) throws Base64DecodingException ,NoSuchAlgorithmException;
}
