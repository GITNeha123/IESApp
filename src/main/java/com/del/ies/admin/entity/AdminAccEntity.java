package com.del.ies.admin.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Data
@Table(name="AdminAcc_Dtls")
public class AdminAccEntity {
	@Id
	@Column(name="id",length=10)
	@GeneratedValue
	private Integer id;
	@Column(name="fname",length=40)
	private String fname;
	@Column(name="lname",length=40)
	private String lname;
	@Column(name="email",length=40)
	private String email;
	@Column(name="pwd",length=20)
	private  String pwd;
	@Column(name="dob",length=20)
	private String dob ;
	@Column(name="gender",length=20)
	private String gender;
	@Column(name="phNo",length=20)
	private String phNo;
	@Column(name="SSN",length=40)
	private  Long ssn;
	@Column(name="role",length=20)
	private  String role;
	@Column(name="cDate",length=10)
	@CreationTimestamp
	private Date createdDate;
	@UpdateTimestamp
	@Column(name="uDate",length=10)
	private Date updatedDate;

	
	public Long getSsn() {
		return ssn;
	}

	public void setSsn(Long ssn) {
		this.ssn = ssn;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

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

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
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

	public Long getGssn() {
		return ssn;
	}

	public void setGssn(Long ssn) {
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
		return "AdminAccEntity [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", pwd="
				+ pwd + ", dob=" + dob + ", gender=" + gender + ", phNo=" + phNo + ", ssn=" + ssn + ", role=" + role
				+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}

	
	

	

	
}
