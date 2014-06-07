package com.kitchensurfing.util;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.kitchensurfing.po.User;

public class OnlineUserList implements Serializable {

	private static Logger LOG = Logger.getLogger(OnlineUserList.class);
	private static final long serialVersionUID = 1L;
	private static final OnlineUserList instance = new OnlineUserList();

	private Map<Long,OnlineUser> onlineUsersByUserId = new HashMap<Long,OnlineUser>();
	private Map<String,OnlineUser> onlineUsersBySessionId = new HashMap<String,OnlineUser>();

	private int maxOnlineNumber = 0;
	private int maxOnlineNumberTimer = 0;
	private int curOnlineNumber = 0;
	private Date maxOnlineDate = new Date();
	private OnlineUserList(){
		//String number = sysinfo.getValue("MaxOnlineNumber");
	/*	if(number != null && !number.equals("")){
			maxOnlineNumber = Integer.parseInt(number);
			maxOnlineDate = sysinfo.getUpdateDate();
		}*/
		LOG.info("OnlineUserList is on");
	}
	
	public static final OnlineUserList getInstance(){
		return instance;
	}
	
	@SuppressWarnings("unused")
	public void addUser(User user,String sessionId){
		if(user != null){
			String userName;
			if(user.getUsername()!=null){
				userName = user.getUsername() + "(" + user.getUsername() + ")";
			}else{
				userName = user.getUsername() + "(" + user.getUsername() + ")";
			}
		//	OnlineUser ou = new OnlineUser(user.getPwd(),userName,sessionId);
		//	ou.setLoginTime(DateTimeUtil.getCurrentDate());
			//ou.setCookieValue(user.getCookieValue());
		//	onlineUsersByUserId.put(ou.getUserId(), ou);
		//	onlineUsersBySessionId.put(ou.getSessionId(), ou);
		//	curOnlineNumber++;
		}
		if(curOnlineNumber > maxOnlineNumber){
			//action
			maxOnlineDate = new Date(System.currentTimeMillis());
			maxOnlineNumber = curOnlineNumber;
		}
		if(curOnlineNumber > maxOnlineNumberTimer){
			maxOnlineNumberTimer = curOnlineNumber;
		}
	}
	
	public OnlineUser getUser(Integer userId){
		return onlineUsersByUserId.get(userId);
	}
	
	public OnlineUser deleteUser(Integer userId){
		OnlineUser ou = null;
		if(onlineUsersByUserId.containsKey(userId)){
			ou = onlineUsersByUserId.remove(userId);
			onlineUsersBySessionId.remove(ou.getSessionId());
			this.curOnlineNumber--;
		}
		return ou;
	}
	
	public OnlineUser deleteUser(String sessionId){
		OnlineUser ou = null;
		if(onlineUsersBySessionId.containsKey(sessionId)){
			ou = onlineUsersBySessionId.remove(sessionId);
			onlineUsersByUserId.remove(ou.getUser().getUserId());
			this.curOnlineNumber--;
		}
		return ou;
	}

	/**
	 * @return the curOnlineNumber
	 */
	public int getCurOnlineNumber() {
		return curOnlineNumber;
	}

	/**
	 * @return the maxOnlineNumber
	 */
	public int getMaxOnlineNumber() {
		return maxOnlineNumber;
	}

	public int getMaxOnlineNumberTimer() {
		int m = maxOnlineNumberTimer;
		maxOnlineNumberTimer = curOnlineNumber;
		return m;
	}
	/**
	 * @return the onlineUserList
	 */
	public Collection<OnlineUser> getOnlineUserList() {
		return onlineUsersByUserId.values();
	}

	/**
	 * @return the maxOnlineDate
	 */
	public Date getMaxOnlineDate() {
		return maxOnlineDate;
	}
	
	public boolean hasUser(Integer userId){
		return onlineUsersByUserId.containsKey(userId);
	}
}
