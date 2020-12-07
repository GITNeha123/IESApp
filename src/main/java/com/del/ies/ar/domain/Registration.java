package com.del.ies.ar.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

public class Registration {
	
	private Integer id;
	private String fname;
	private String lname;
	private String email;
	private String dob ;
	private String gender;
	private String phNo;
	private  Long ssn;
     private String arID;
	private String status;
	
	
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhNo() {
		return phNo;
	}
	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}
	public Long getSsn() {
		return ssn;
	}
	public void setSsn(Long ssn) {
		this.ssn = ssn;
	}
	public String getArID() {
		return arID;
	}
	public void setArID(String arID) {
		this.arID = arID;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Registration [ fname=" + fname + ", lname=" + lname + ", email=" + email + ", dob=" + dob
				+ ", gender=" + gender + ", phNo=" + phNo + ", ssn=" + ssn + ", arID=" + arID + ", status=" + status
				+ "]";
	}
	
	
	
	}

