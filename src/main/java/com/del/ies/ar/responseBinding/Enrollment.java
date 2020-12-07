package com.del.ies.ar.responseBinding;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Enrollment {
	private Long ssn ;
	private String fName;
	private String lName;
	private String gender;
	private String dob;
	private String stateName;
	//private Blob photo;
	private Date createdDate;
	private Date updatedDate;
	public Long getSsn() {
		return ssn;
	}
	public void setSsn(Long ssn) {
		this.ssn = ssn;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	@Override
	public String toString() {
		return "Enrollment [ssn=" + ssn + ", fName=" + fName + ", lName=" + lName + ", gender=" + gender + ", dob="
				+ dob + ", stateName=" + stateName + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate
				+ "]";
	}

}
