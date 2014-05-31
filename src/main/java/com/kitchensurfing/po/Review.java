package com.kitchensurfing.po;

import java.io.Serializable;
/**
 * @time
 * @author Hansel
 * @Pojo 
 */
public class Review implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int reviewId;
	private int chefId;
	private int userId;
	private String content;
	private String description;
	private String positive;
	private String negative;
	private String date;
	private String statused;
	public int getReviewId() {
		return reviewId;
	}
	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}
	public int getChefId() {
		return chefId;
	}
	public void setChefId(int chefId) {
		this.chefId = chefId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPositive() {
		return positive;
	}
	public void setPositive(String positive) {
		this.positive = positive;
	}
	public String getNegative() {
		return negative;
	}
	public void setNegative(String negative) {
		this.negative = negative;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStatused() {
		return statused;
	}
	public void setStatused(String statused) {
		this.statused = statused;
	}
	public Review(int reviewId, int chefId, int userId, String content,
			String description, String positive, String negative, String date,
			String statused) {
		super();
		this.reviewId = reviewId;
		this.chefId = chefId;
		this.userId = userId;
		this.content = content;
		this.description = description;
		this.positive = positive;
		this.negative = negative;
		this.date = date;
		this.statused = statused;
	}
	public Review(){
		super();
	}
	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", chefId=" + chefId
				+ ", userId=" + userId + ", content=" + content
				+ ", description=" + description + ", positive=" + positive
				+ ", negative=" + negative + ", date=" + date + ", statused="
				+ statused + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + chefId;
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result
				+ ((negative == null) ? 0 : negative.hashCode());
		result = prime * result
				+ ((positive == null) ? 0 : positive.hashCode());
		result = prime * result + reviewId;
		result = prime * result
				+ ((statused == null) ? 0 : statused.hashCode());
		result = prime * result + userId;
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
		Review other = (Review) obj;
		if (chefId != other.chefId)
			return false;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (negative == null) {
			if (other.negative != null)
				return false;
		} else if (!negative.equals(other.negative))
			return false;
		if (positive == null) {
			if (other.positive != null)
				return false;
		} else if (!positive.equals(other.positive))
			return false;
		if (reviewId != other.reviewId)
			return false;
		if (statused == null) {
			if (other.statused != null)
				return false;
		} else if (!statused.equals(other.statused))
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}

}
