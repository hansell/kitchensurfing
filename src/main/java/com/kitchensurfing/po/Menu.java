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
	private String menuCreateDate;
	private String description;
	private String minimumPerson;
	private String minimumHour;
	//private String minimumCharge;
	private String maximunPerson;
	private String maximumChargePerPerson;
	private String minimunchargePerPerson;
	private String statused;
	private String rank;
	private String isCheck;
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
	public String getMenuCreateDate() {
		return menuCreateDate;
	}
	public void setMenuCreateDate(String menuCreateDate) {
		this.menuCreateDate = menuCreateDate;
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
	public String getMinimunchargePerPerson() {
		return minimunchargePerPerson;
	}
	public void setMinimunchargePerPerson(String minimunchargePerPerson) {
		this.minimunchargePerPerson = minimunchargePerPerson;
	}
	public String getStatused() {
		return statused;
	}
	public void setStatused(String statused) {
		this.statused = statused;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getIsCheck() {
		return isCheck;
	}
	public void setIsCheck(String isCheck) {
		this.isCheck = isCheck;
	}
	public Menu(int chefId, int menuId, String title, String menuCreateDate,
			String description, String minimumPerson, String minimumHour,
			String maximunPerson, String maximumChargePerPerson,
			String minimunchargePerPerson, String statused, String rank,
			String isCheck) {
		super();
		this.chefId = chefId;
		this.menuId = menuId;
		this.title = title;
		this.menuCreateDate = menuCreateDate;
		this.description = description;
		this.minimumPerson = minimumPerson;
		this.minimumHour = minimumHour;
		this.maximunPerson = maximunPerson;
		this.maximumChargePerPerson = maximumChargePerPerson;
		this.minimunchargePerPerson = minimunchargePerPerson;
		this.statused = statused;
		this.rank = rank;
		this.isCheck = isCheck;
	}
	public Menu(){
		super();
	}
}
