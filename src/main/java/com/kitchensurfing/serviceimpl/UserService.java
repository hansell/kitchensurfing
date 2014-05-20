package com.kitchensurfing.serviceimpl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.kitchensurfing.idao.IUserDao;
import com.kitchensurfing.iservice.IUserService;
import com.kitchensurfing.po.User;

@Repository
@Service("userService")
public class UserService implements Serializable, IUserService {

	/**
	 * serializable id
	 */
	@Autowired
	private IUserDao userDao;
	private static final long serialVersionUID = 1L;

	public boolean logIn(final String account, final String userPassword) {
		// TODO Auto-generated method stub
		if(userDao.getUser(account, userPassword)!=null)
			return true;
		else
			return false;
	}

	public void logOut() {
		// TODO Auto-generated method stub
		
	}

}
