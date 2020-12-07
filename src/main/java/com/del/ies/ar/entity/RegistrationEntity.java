package com.del.ies.ar.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.Where;

import lombok.Data;

@Entity
@Data
@Table(name="REGISTRATION_Dtls")
public class RegistrationEntity {
	
	@Column(name="id",length=10)
	private Integer id;
	
	@Id
	@GeneratedValue(generator="ar_ID")
	@GenericGenerator(name="ar_ID",strategy="com.del.ies.generator.EnrlmentGenerator")
	@Column(name="ar_ID",length=40)
	private String arID;
	
	@Column(name="staus",length=40)
	private String status;
	
	@Column(name="fname",length=40)
	private String fname;
	
	@Column(name="lname",length=40)
	private String lname;
	
	@Column(name="email",length=40)
	private String email;
	
	@Column(name="dob",length=20)
	private String dob ;
	
	@Column(name="gender",length=20)
	private String gender;
	
	@Column(name="phNo",length=20)
	private String phNo;
	
	@Column(name="SSN",length=40)
	private  Long ssn;
	
	@Column(name="cDate",length=10)
	@CreationTimestamp
	private Date createdDate;
	
	@UpdateTimestamp
	@Column(name="uDate",length=10)
	private Date updatedDate;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


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
		return "RegistrationEntity [arID=" + arID + ", status=" + status + ", fname=" + fname
				+ ", lname=" + lname + ", email=" + email + ", dob=" + dob + ", gender=" + gender + ", phNo=" + phNo
				+ ", ssn=" + ssn + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}
}
