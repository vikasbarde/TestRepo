package com.hib.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author vikas
 *
 */
public class Event implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7379686255043753983L;
	private int id;
	private String description;
	private Date eventDate;
	private String place;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getEventDate() {
		return eventDate;
	}
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((eventDate == null) ? 0 : eventDate.hashCode());
		result = prime * result + id;
		result = prime * result + ((place == null) ? 0 : place.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Event))
			return false;
		Event other = (Event) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (eventDate == null) {
			if (other.eventDate != null)
				return false;
		} else if (!eventDate.equals(other.eventDate))
			return false;
		if (id != other.id)
			return false;
		if (place == null) {
			if (other.place != null)
				return false;
		} else if (!place.equals(other.place))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Event [id=" + id + ", description=" + description + ", eventDate=" + eventDate + ", place=" + place
				+ "]";
	}
	
	
	
	

}
