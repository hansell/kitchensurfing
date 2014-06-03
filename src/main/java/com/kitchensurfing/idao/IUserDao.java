package com.kitchensurfing.idao;

import com.kitchensurfing.po.User;

public interface IUserDao {

	public boolean addUser(User user);
    public boolean isUserExists(User user);
    public User getUser(String account,String userPassword);
    public User getUser(String account);
}
