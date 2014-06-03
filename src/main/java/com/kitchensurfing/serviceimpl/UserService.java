package com.kitchensurfing.serviceimpl;

import java.io.Serializable;
import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.kitchensurfing.common.MD5MessageDigest;
import com.kitchensurfing.config.util.KitchenServletListener;
import com.kitchensurfing.config.util.SystemCache;
import com.kitchensurfing.idao.IUserDao;
import com.kitchensurfing.iservice.IUserService;
import com.kitchensurfing.po.User;
import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;
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

	public User addUser(HttpServletRequest req) throws Base64DecodingException, NoSuchAlgorithmException {
		String key = req.getParameter("key");
		User user = new User();
		long createTime;
		long distance;
		if (SystemCache.containUser(key)) {
			key = new String(
					com.sun.org.apache.xml.internal.security.utils.Base64
							.decode(key.getBytes()));
			String[] items = key.split("&");

			createTime = Long.parseLong(items[3]);

			distance = System.currentTimeMillis() - createTime;

			if (distance >= KitchenServletListener.PERIOD) {
				return null;
			}
			user.setUsername(items[0]);
			user.setUserPassword(MD5MessageDigest.Md5Encode(items[1]));
			user.setAccount(items[2]);
			userDao.addUser(user);
		}
		return user;
	}

	public User getUser(final String account) {
		// TODO Auto-generated method stub
		return userDao.getUser(account);
	}

}
