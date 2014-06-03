package com.kitchensurfing.po;

import java.io.Serializable;
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
    private String personalUrl;
    private String experience;
    private String trainingSchoolName;
    private String schoolLocation;
    private String employerName;
    private String workNear;
    private String photo;
    private String phone;
    private String travelPlace;
    private String price;
    private String availableDay;
    private String statused;
    private String personalDetails;
    private String isApproved;
    private String approvedTime;
    private int approvedManager;
    private String trueName;
    private String firstName;
    private String lastName;
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
	public String getPersonalUrl() {
		return personalUrl;
	}
	public void setPersonalUrl(String personalUrl) {
		this.personalUrl = personalUrl;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getTrainingSchoolName() {
		return trainingSchoolName;
	}
	public void setTrainingSchoolName(String trainingSchoolName) {
		this.trainingSchoolName = trainingSchoolName;
	}
	public String getSchoolLocation() {
		return schoolLocation;
	}
	public void setSchoolLocation(String schoolLocation) {
		this.schoolLocation = schoolLocation;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
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
	public String getStatused() {
		return statused;
	}
	public void setStatused(String statused) {
		this.statused = statused;
	}

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPersonalDetails() {
		return personalDetails;
	}
	public void setPersonalDetails(String personalDetails) {
		this.personalDetails = personalDetails;
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
		this.personalUrl = personalUrl;
		this.experience = experience;
		this.trainingSchoolName = trainingSchoolName;
		this.schoolLocation = schoolLocation;
		this.employerName = employerName;
		this.workNear = workNear;
		this.photo = photo;
		this.phone = phone;
		this.travelPlace = travelPlace;
		this.price = price;
		this.availableDay = availableDay;
		this.statused = statused;
		this.personalDetails = personalDetails;
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
		this.personalUrl = personalUrl;
		this.experience = experience;
		this.trainingSchoolName = trainingSchoolName;
		this.schoolLocation = schoolLocation;
		this.employerName = employerName;
		this.workNear = workNear;
		this.photo = photo;
		this.phone = phone;
		this.travelPlace = travelPlace;
		this.price = price;
		this.availableDay = availableDay;
		this.statused = statused;
		this.personalDetails = personalDetails;
		this.isApproved = isApproved;
		this.approvedTime = approvedTime;
		this.approvedManager = approvedManager;
		this.trueName = trueName;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
}
