package com.del.ies.dc.domain;

public class CreateCase {
	private Integer cID;
	private String rID;
	private String name;
	private String dob ;
	private String email;
	private String gender;
	private String phNo;
	private  Long ssn;
	
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	@Override
	public String toString() {
		return "CreateCase [cID=" + cID + ", rID=" + rID + ", name=" + name + ", dob=" + dob + ", email=" + email
				+ ", gender=" + gender + ", phNo=" + phNo + ", ssn=" + ssn + "]";
	}
	
     
	
}
