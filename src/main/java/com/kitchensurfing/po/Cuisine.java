package com.kitchensurfing.po;

import java.io.Serializable;

/**
 * 
 * @author Hansel
 * Cuisine is a style of cooking
 */
public class Cuisine implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    //filed
	private int cuisineId;
	private int menuId;
	private String cuisineName;
	private String description;
	private String statused;
	//getter and setter
	public int getCuisineId() {
		return cuisineId;
	}
	public void setCuisineId(int cuisineId) {
		this.cuisineId = cuisineId;
	}
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public String getCuisineName() {
		return cuisineName;
	}
	public void setCuisineName(String cuisineName) {
		this.cuisineName = cuisineName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatused() {
		return statused;
	}
	public void setStatused(String statused) {
		this.statused = statused;
	}
	//construction
	public Cuisine(){
		super();
	}
	public Cuisine(int cuisineId, int menuId, String cuisineName,
			String description, String statused) {
		super();
		this.cuisineId = cuisineId;
		this.menuId = menuId;
		this.cuisineName = cuisineName;
		this.description = description;
		this.statused = statused;
	}
	public Cuisine(int menuId, String cuisineName) {
		super();
		this.menuId = menuId;
		this.cuisineName = cuisineName;
	}
	public Cuisine(int menuId, String cuisineName, String description) {
		super();
		this.menuId = menuId;
		this.cuisineName = cuisineName;
		this.description = description;
	}
	@Override
	public String toString() {
		return "Cuisine [cuisineId=" + cuisineId + ", menuId=" + menuId
				+ ", cuisineName=" + cuisineName + ", description="
				+ description + ", statused=" + statused + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cuisineId;
		result = prime * result
				+ ((cuisineName == null) ? 0 : cuisineName.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + menuId;
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
		Cuisine other = (Cuisine) obj;
		if (cuisineId != other.cuisineId)
			return false;
		if (cuisineName == null) {
			if (other.cuisineName != null)
				return false;
		} else if (!cuisineName.equals(other.cuisineName))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (menuId != other.menuId)
			return false;
		if (statused == null) {
			if (other.statused != null)
				return false;
		} else if (!statused.equals(other.statused))
			return false;
		return true;
	}
	
}
