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
    private String statused;
    private int pid;
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
	public String getStatused() {
		return statused;
	}
	public void setStatused(String statused) {
		this.statused = statused;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
   
}
