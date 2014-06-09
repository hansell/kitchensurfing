package com.kitchensurfing.po;

import java.io.Serializable;
import java.util.List;

/**
 * @time 30 May 2014
 * @author Hansel
 * @description chef's POJO
 */
public class Chef implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int chefId;
	private int locationId;
	private String account;
	private String chefPassword;
	private String tagLine;
	private String vanityUrl;
	private String webChat;
	private String qq;
	private String workNear;
	private String photo;
	private String phone;
	private String travelPlace;
	private String price;
	private String availableDay;
	private String status;
	private String isApproved;
	private String approvedTime;
	private int approvedManager;
	private String trueName;
	private String firstName;
	private String lastName;
	private String userid;
	private String personalkey;
	private String personalspecial;
	private String favoringredientone;
	private String favoringredienttwo;
	private String favoringredientthree;
	private String cookstyle;
	private String weblocationone;
	private String weblocationtwo;
	private String weblocationthree;

	
	public String getWeblocationthree() {
		return weblocationthree;
	}

	public void setWeblocationthree(String weblocationthree) {
		this.weblocationthree = weblocationthree;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getWeblocationone() {
		return weblocationone;
	}

	public void setWeblocationone(String weblocationone) {
		this.weblocationone = weblocationone;
	}

	public String getWeblocationtwo() {
		return weblocationtwo;
	}

	public void setWeblocationtwo(String weblocationtwo) {
		this.weblocationtwo = weblocationtwo;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPersonalkey() {
		return personalkey;
	}

	public void setPersonalkey(String personalkey) {
		this.personalkey = personalkey;
	}

	public String getPersonalspecial() {
		return personalspecial;
	}

	public void setPersonalspecial(String personalspecial) {
		this.personalspecial = personalspecial;
	}

	public String getFavoringredientone() {
		return favoringredientone;
	}

	public void setFavoringredientone(String favoringredientone) {
		this.favoringredientone = favoringredientone;
	}

	public String getFavoringredienttwo() {
		return favoringredienttwo;
	}

	public void setFavoringredienttwo(String favoringredienttwo) {
		this.favoringredienttwo = favoringredienttwo;
	}

	public String getFavoringredientthree() {
		return favoringredientthree;
	}

	public void setFavoringredientthree(String favoringredientthree) {
		this.favoringredientthree = favoringredientthree;
	}

	public String getCookstyle() {
		return cookstyle;
	}

	public void setCookstyle(String cookstyle) {
		this.cookstyle = cookstyle;
	}

	public int getChefId() {
		return chefId;
	}

	public void setChefId(int chefId) {
		this.chefId = chefId;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getChefPassword() {
		return chefPassword;
	}

	public void setChefPassword(String chefPassword) {
		this.chefPassword = chefPassword;
	}

	public String getTagLine() {
		return tagLine;
	}

	public void setTagLine(String tagLine) {
		this.tagLine = tagLine;
	}

	public String getVanityUrl() {
		return vanityUrl;
	}

	public void setVanityUrl(String vanityUrl) {
		this.vanityUrl = vanityUrl;
	}

	public String getWebChat() {
		return webChat;
	}

	public void setWebChat(String webChat) {
		this.webChat = webChat;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getWorkNear() {
		return workNear;
	}

	public void setWorkNear(String workNear) {
		this.workNear = workNear;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getTravelPlace() {
		return travelPlace;
	}

	public void setTravelPlace(String travelPlace) {
		this.travelPlace = travelPlace;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getAvailableDay() {
		return availableDay;
	}

	public void setAvailableDay(String availableDay) {
		this.availableDay = availableDay;
	}


	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getIsApproved() {
		return isApproved;
	}

	public void setIsApproved(String isApproved) {
		this.isApproved = isApproved;
	}

	public String getApprovedTime() {
		return approvedTime;
	}

	public void setApprovedTime(String approvedTime) {
		this.approvedTime = approvedTime;
	}

	public int getApprovedManager() {
		return approvedManager;
	}

	public void setApprovedManager(int approvedManager) {
		this.approvedManager = approvedManager;
	}

	public Chef() {
		super();
	}

	public String getTrueName() {
		return trueName;
	}

	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Chef(int chefId, int locationId, String account,
			String chefPassword, String tagLine, String vanityUrl,
			String webChat, String qq, String personalUrl, String experience,
			String trainingSchoolName, String schoolLocation,
			String employerName, String workNear, String photo, String phone,
			String travelPlace, String price, String availableDay,
			String statused, String personalDetails, String isApproved,
			String approvedTime, int approvedManager) {
		super();
		this.chefId = chefId;
		this.locationId = locationId;
		this.account = account;
		this.chefPassword = chefPassword;
		this.tagLine = tagLine;
		this.vanityUrl = vanityUrl;
		this.webChat = webChat;
		this.qq = qq;
		this.workNear = workNear;
		this.photo = photo;
		this.phone = phone;
		this.travelPlace = travelPlace;
		this.price = price;
		this.availableDay = availableDay;
		this.isApproved = isApproved;
		this.approvedTime = approvedTime;
		this.approvedManager = approvedManager;
	}

	public Chef(int chefId, int locationId, String account,
			String chefPassword, String tagLine, String vanityUrl,
			String webChat, String qq, String personalUrl, String experience,
			String trainingSchoolName, String schoolLocation,
			String employerName, String workNear, String photo, String phone,
			String travelPlace, String price, String availableDay,
			String statused, String personalDetails, String isApproved,
			String approvedTime, int approvedManager, String trueName,
			String firstName, String lastName) {
		super();
		this.chefId = chefId;
		this.locationId = locationId;
		this.account = account;
		this.chefPassword = chefPassword;
		this.tagLine = tagLine;
		this.vanityUrl = vanityUrl;
		this.webChat = webChat;
		this.qq = qq;
		this.workNear = workNear;
		this.photo = photo;
		this.phone = phone;
		this.travelPlace = travelPlace;
		this.price = price;
		this.availableDay = availableDay;
		this.isApproved = isApproved;
		this.approvedTime = approvedTime;
		this.approvedManager = approvedManager;
		this.trueName = trueName;
		this.firstName = firstName;
		this.lastName = lastName;
	}

}
