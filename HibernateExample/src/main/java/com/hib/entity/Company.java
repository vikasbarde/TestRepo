package com.hib.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author vikas
 *
 */
@Entity
public class Company implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1433858108397114785L;
	@Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "company_id")
	private int companyId;
	@Column(name = "company_name")
	private String companyName;
	@Column(name = "registration_date")
	private String registrationDate;
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + companyId;
		result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
		result = prime * result + ((registrationDate == null) ? 0 : registrationDate.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Company))
			return false;
		Company other = (Company) obj;
		if (companyId != other.companyId)
			return false;
		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.equals(other.companyName))
			return false;
		if (registrationDate == null) {
			if (other.registrationDate != null)
				return false;
		} else if (!registrationDate.equals(other.registrationDate))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", registrationDate="
				+ registrationDate + "]";
	}
	
	
	
	
}
