package com.kitchensurfing.po;

import java.io.Serializable;
/**
 * @time
 * @author Hansel
 * @description
 */
public class Course implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private int courseId;
    private int userId;
    private String courseTitle;
    private String description;
    private String statused;
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
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
	public Course(int courseId, int userId, String courseTitle,
			String description, String statused) {
		super();
		this.courseId = courseId;
		this.userId = userId;
		this.courseTitle = courseTitle;
		this.description = description;
		this.statused = statused;
	}
    public Course(){
    	super();
    }
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + courseId;
		result = prime * result
				+ ((courseTitle == null) ? 0 : courseTitle.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result + userId;
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
		Course other = (Course) obj;
		if (courseId != other.courseId)
			return false;
		if (courseTitle == null) {
			if (other.courseTitle != null)
				return false;
		} else if (!courseTitle.equals(other.courseTitle))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (userId != other.userId)
			return false;
		if (statused == null) {
			if (other.statused != null)
				return false;
		} else if (!statused.equals(other.statused))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", menuId=" + userId
				+ ", courseTitle=" + courseTitle + ", description="
				+ description + ", statused=" + statused + "]";
	}
    
}
