package com.kitchensurfing.po;

import java.io.Serializable;

import org.springframework.stereotype.Component;

/**
 * 
 * @author Hansel
 *
 */
@Component
public class User  implements Serializable{

	private static final long serialVersionUID = 1L;
	//field
	private int userId;
	private int locationId;
	private String username;
	private String account;
	private String userPassword;
	private Gender gender;
	private String birthday;
	private String address;
	private String profile_photo;
	private String firstName;
	private String lastName;
	private String statused;
	private String createUserDate;
	
	public enum Gender
	{
		MALE,
		FEMALE
	}
	//coustractor
	public User() {
		super();
	}

	public User(String username, String userPassword) {
		super();
		this.username = username;
		this.userPassword = userPassword;
	}

	public User(String username, String account, String userPassword) {
		super();
		this.username = username;
		this.account = account;
		this.userPassword = userPassword;
	}

	public User(int locationId, String username, String account,
			String userPassword) {
		super();
		this.locationId = locationId;
		this.username = username;
		this.account = account;
		this.userPassword = userPassword;
	}

	public User(String username, String account, String userPassword,
			String createUserDate) {
		super();
		this.username = username;
		this.account = account;
		this.userPassword = userPassword;
		this.createUserDate = createUserDate;
	}

	public User(int userId, int locationId, String username, String account,
			String userPassword, Gender gender, String birthday,
			String address, String profile_photo, String firstName,
			String lastName, String statused, String createUserDate) {
		super();
		this.userId = userId;
		this.locationId = locationId;
		this.username = username;
		this.account = account;
		this.userPassword = userPassword;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
		this.profile_photo = profile_photo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.statused = statused;
		this.createUserDate = createUserDate;
	}

	//getter and setter

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}


	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getProfile_photo() {
		return profile_photo;
	}

	public void setProfile_photo(String profile_photo) {
		this.profile_photo = profile_photo;
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

	public String getStatused() {
		return statused;
	}

	public void setStatused(String statused) {
		this.statused = statused;
	}

	public String getCreateUserDate() {
		return createUserDate;
	}

	public void setCreateUserDate(String createUserDate) {
		this.createUserDate = createUserDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((account == null) ? 0 : account.hashCode());
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result
				+ ((birthday == null) ? 0 : birthday.hashCode());
		result = prime * result
				+ ((createUserDate == null) ? 0 : createUserDate.hashCode());
		result = prime * result
				+ ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result
				+ ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + locationId;
		result = prime * result
				+ ((profile_photo == null) ? 0 : profile_photo.hashCode());
		result = prime * result
				+ ((statused == null) ? 0 : statused.hashCode());
		result = prime * result + userId;
		result = prime * result
				+ ((userPassword == null) ? 0 : userPassword.hashCode());
		result = prime * result
				+ ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (account == null) {
			if (other.account != null)
				return false;
		} else if (!account.equals(other.account))
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (birthday == null) {
			if (other.birthday != null)
				return false;
		} else if (!birthday.equals(other.birthday))
			return false;
		if (createUserDate == null) {
			if (other.createUserDate != null)
				return false;
		} else if (!createUserDate.equals(other.createUserDate))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (gender != other.gender)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (locationId != other.locationId)
			return false;
		if (profile_photo == null) {
			if (other.profile_photo != null)
				return false;
		} else if (!profile_photo.equals(other.profile_photo))
			return false;
		if (statused == null) {
			if (other.statused != null)
				return false;
		} else if (!statused.equals(other.statused))
			return false;
		if (userId != other.userId)
			return false;
		if (userPassword == null) {
			if (other.userPassword != null)
				return false;
		} else if (!userPassword.equals(other.userPassword))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", locationId=" + locationId
				+ ", username=" + username + ", account=" + account
				+ ", userPassword=" + userPassword + ", gender=" + gender
				+ ", birthday=" + birthday + ", address=" + address
				+ ", profile_photo=" + profile_photo + ", firstName="
				+ firstName + ", lastName=" + lastName + ", statused="
				+ statused + ", createUserDate=" + createUserDate + "]";
	}

	
}
