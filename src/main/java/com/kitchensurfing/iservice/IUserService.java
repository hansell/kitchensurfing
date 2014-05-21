package com.kitchensurfing.iservice;

import com.kitchensurfing.po.User;

/**
 * service of user's operation
 * @author Hansel
 *
 */
public interface IUserService {
    public boolean logIn(String account,String userPassword);
    public void logOut();
}
