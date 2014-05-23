package com.kitchensurfing.po;

import java.io.Serializable;

public class Location implements Serializable {

	/**
	 * The location is the part that we have the service
	 */
	//field
	private static final long serialVersionUID = 1L;
    private int locationId;
    private String locationName;
    private String locationEnglishCode;
    private String locationCreateDate;
    private String statused;
    //getter and setter
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public String getLocationEnglishCode() {
		return locationEnglishCode;
	}
	public void setLocationEnglishCode(String locationEnglishCode) {
		this.locationEnglishCode = locationEnglishCode;
	}
	public String getLocationCreateDate() {
		return locationCreateDate;
	}
	public void setLocationCreateDate(String locationCreateDate) {
		this.locationCreateDate = locationCreateDate;
	}
	public String getStatused() {
		return statused;
	}
	public void setStatused(String statused) {
		this.statused = statused;
	}
    //constructor
	public Location(int locationId, String locationName,
			String locationEnglishCode, String locationCreateDate,
			String statused) {
		super();
		this.locationId = locationId;
		this.locationName = locationName;
		this.locationEnglishCode = locationEnglishCode;
		this.locationCreateDate = locationCreateDate;
		this.statused = statused;
	}
	public Location(){
		super();
	}
	public Location(String locationName, String locationEnglishCode,
			String locationCreateDate) {
		super();
		this.locationName = locationName;
		this.locationEnglishCode = locationEnglishCode;
		this.locationCreateDate = locationCreateDate;
	}
	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", locationName="
				+ locationName + ", locationEnglishCode=" + locationEnglishCode
				+ ", locationCreateDate=" + locationCreateDate + ", statused="
				+ statused + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((locationCreateDate == null) ? 0 : locationCreateDate
						.hashCode());
		result = prime
				* result
				+ ((locationEnglishCode == null) ? 0 : locationEnglishCode
						.hashCode());
		result = prime * result + locationId;
		result = prime * result
				+ ((locationName == null) ? 0 : locationName.hashCode());
		result = prime * result
				+ ((statused == null) ? 0 : statused.hashCode());
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
		Location other = (Location) obj;
		if (locationCreateDate == null) {
			if (other.locationCreateDate != null)
				return false;
		} else if (!locationCreateDate.equals(other.locationCreateDate))
			return false;
		if (locationEnglishCode == null) {
			if (other.locationEnglishCode != null)
				return false;
		} else if (!locationEnglishCode.equals(other.locationEnglishCode))
			return false;
		if (locationId != other.locationId)
			return false;
		if (locationName == null) {
			if (other.locationName != null)
				return false;
		} else if (!locationName.equals(other.locationName))
			return false;
		if (statused == null) {
			if (other.statused != null)
				return false;
		} else if (!statused.equals(other.statused))
			return false;
		return true;
	}
	
}
