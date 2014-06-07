package com.kitchensurfing.util;

import java.io.Serializable;
import java.util.Date;

import com.kitchensurfing.po.User;

public class OnlineUser implements Serializable{

	private static final long serialVersionUID = 1L;
	private String sessionId;
	private String cookieValue;
	private Date loginTime;
	private User user;
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getCookieValue() {
		return cookieValue;
	}
	public void setCookieValue(String cookieValue) {
		this.cookieValue = cookieValue;
	}
	public Date getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public OnlineUser(String sessionId, String cookieValue, Date loginTime,
			User user) {
		super();
		this.sessionId = sessionId;
		this.cookieValue = cookieValue;
		this.loginTime = loginTime;
		this.user = user;
	}
	
}
