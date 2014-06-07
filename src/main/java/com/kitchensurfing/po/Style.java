package com.kitchensurfing.po;

import java.io.Serializable;
/**
 * @time June 2
 * @author Hansel
 *
 */
public class Style implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int styleId;
	private int menuId;
	private String styleName;
	private String code;
	private String description;
	private String statused;
	public int getStyleId() {
		return styleId;
	}
	public void setStyleId(int styleId) {
		this.styleId = styleId;
	}
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public String getStyleName() {
		return styleName;
	}
	public void setStyleName(String styleName) {
		this.styleName = styleName;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
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
	public Style(int styleId, int menuId, String styleName, String code,
			String description, String statused) {
		super();
		this.styleId = styleId;
		this.menuId = menuId;
		this.styleName = styleName;
		this.code = code;
		this.description = description;
		this.statused = statused;
	}
	public Style(){
		super();
	}
	@Override
	public String toString() {
		return "Style [styleId=" + styleId + ", menuId=" + menuId
				+ ", styleName=" + styleName + ", code=" + code
				+ ", description=" + description + ", statused=" + statused
				+ "]";
	}

}
