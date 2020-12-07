package com.del.ies.dc.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Data
@Table(name="DC_cases")
public class CreateCaseEntity {

@Id
@GeneratedValue(generator="cID")
@GenericGenerator(name="cID",strategy="com.del.ies.generator.DCGenerator")
@Column(name="cID",length=40)
private Integer cID;

	@Column(name="ar_ID",length=40)
	private String rID;
	@Column(name="NAME",length=40)
	private String name;
@Column(name="EMAIL",length=40)
	private String email;
	@Column(name="DOB",length=20)
	private String dob ;
	@Column(name="GENDER",length=20)
	private String gender;
	@Column(name="PHNO",length=20)
	private String phNo;
	@Column(name="SSN",length=40)
	private  Long ssn;
	@Column(name="C_DATE",length=15)
	@CreationTimestamp
	private Date createdDate;
	@UpdateTimestamp
	@Column(name="U_DATE",length=15)
	private Date updatedDate;
	public Integer getcID() {
		return cID;
	}
	public void setcID(Integer cID) {
		this.cID = cID;
	}
	
	public String getrID() {
		return rID;
	}
	public void setrID(String rID) {
		this.rID = rID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		return "CreateCaseEntity [cID=" + cID + ", rID=" + rID + ", name=" + name + ", email=" + email + ", dob="
				+ dob + ", gender=" + gender + ", phNo=" + phNo + ", ssn=" + ssn + ", createdDate=" + createdDate
				+ ", updatedDate=" + updatedDate + "]";
	}
	
	
	

	
}
