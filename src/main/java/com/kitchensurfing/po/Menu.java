package com.kitchensurfing.po;

import java.io.Serializable;

public class Menu implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int chefId;
	private int menuId;
	private String title;
	private String menu_create_date;
	private String description;
	private String minimumPerson;
	private String minimumHour;
	private String minimumCharge;
	private String maximunPerson;
	private String maximumChargePerPerson;
	  //field
	public int getChefId() {
		return chefId;
	}
	public void setChefId(int chefId) {
		this.chefId = chefId;
	}
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMenu_create_date() {
		return menu_create_date;
	}
	public void setMenu_create_date(String menu_create_date) {
		this.menu_create_date = menu_create_date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMinimumPerson() {
		return minimumPerson;
	}
	public void setMinimumPerson(String minimumPerson) {
		this.minimumPerson = minimumPerson;
	}
	public String getMinimumHour() {
		return minimumHour;
	}
	public void setMinimumHour(String minimumHour) {
		this.minimumHour = minimumHour;
	}
	public String getMinimumCharge() {
		return minimumCharge;
	}
	public void setMinimumCharge(String minimumCharge) {
		this.minimumCharge = minimumCharge;
	}
	public String getMaximunPerson() {
		return maximunPerson;
	}
	public void setMaximunPerson(String maximunPerson) {
		this.maximunPerson = maximunPerson;
	}
	public String getMaximumChargePerPerson() {
		return maximumChargePerPerson;
	}
	public void setMaximumChargePerPerson(String maximumChargePerPerson) {
		this.maximumChargePerPerson = maximumChargePerPerson;
	}
	//constructor
	public Menu(int chefId, int menuId, String title, String menu_create_date,
			String description, String minimumPerson, String minimumHour,
			String minimumCharge, String maximunPerson,
			String maximumChargePerPerson) {
		super();
		this.chefId = chefId;
		this.menuId = menuId;
		this.title = title;
		this.menu_create_date = menu_create_date;
		this.description = description;
		this.minimumPerson = minimumPerson;
		this.minimumHour = minimumHour;
		this.minimumCharge = minimumCharge;
		this.maximunPerson = maximunPerson;
		this.maximumChargePerPerson = maximumChargePerPerson;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + chefId;
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime
				* result
				+ ((maximumChargePerPerson == null) ? 0
						: maximumChargePerPerson.hashCode());
		result = prime * result
				+ ((maximunPerson == null) ? 0 : maximunPerson.hashCode());
		result = prime * result + menuId;
		result = prime
				* result
				+ ((menu_create_date == null) ? 0 : menu_create_date.hashCode());
		result = prime * result
				+ ((minimumCharge == null) ? 0 : minimumCharge.hashCode());
		result = prime * result
				+ ((minimumHour == null) ? 0 : minimumHour.hashCode());
		result = prime * result
				+ ((minimumPerson == null) ? 0 : minimumPerson.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Menu other = (Menu) obj;
		if (chefId != other.chefId)
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (maximumChargePerPerson == null) {
			if (other.maximumChargePerPerson != null)
				return false;
		} else if (!maximumChargePerPerson.equals(other.maximumChargePerPerson))
			return false;
		if (maximunPerson == null) {
			if (other.maximunPerson != null)
				return false;
		} else if (!maximunPerson.equals(other.maximunPerson))
			return false;
		if (menuId != other.menuId)
			return false;
		if (menu_create_date == null) {
			if (other.menu_create_date != null)
				return false;
		} else if (!menu_create_date.equals(other.menu_create_date))
			return false;
		if (minimumCharge == null) {
			if (other.minimumCharge != null)
				return false;
		} else if (!minimumCharge.equals(other.minimumCharge))
			return false;
		if (minimumHour == null) {
			if (other.minimumHour != null)
				return false;
		} else if (!minimumHour.equals(other.minimumHour))
			return false;
		if (minimumPerson == null) {
			if (other.minimumPerson != null)
				return false;
		} else if (!minimumPerson.equals(other.minimumPerson))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Menu [chefId=" + chefId + ", menuId=" + menuId + ", title="
				+ title + ", menu_create_date=" + menu_create_date
				+ ", description=" + description + ", minimumPerson="
				+ minimumPerson + ", minimumHour=" + minimumHour
				+ ", minimumCharge=" + minimumCharge + ", maximunPerson="
				+ maximunPerson + ", maximumChargePerPerson="
				+ maximumChargePerPerson + "]";
	}
	
}
