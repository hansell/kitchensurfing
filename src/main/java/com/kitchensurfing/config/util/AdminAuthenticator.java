package com.kitchensurfing.config.util;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

/**
 * 授权邮箱用户名和密码
 * @author lsj(李三杰)
 *
 */
public class AdminAuthenticator extends Authenticator {

	String userName = null;
	String password = null;

	public AdminAuthenticator() {
	}

	public AdminAuthenticator(String username, String password) {
		this.userName = username;
		this.password = password;
	}

	protected PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication(userName, password);
	}
}
