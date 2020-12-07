package com.del.ies.dc.domain;

import javax.persistence.Column;

public class CreatePlan {
	private Integer cID;
	private String fname;
	private String lname;
	private String pname;
	public Integer getcID() {
		return cID;
	}
	public void setcID(Integer cID) {
		this.cID = cID;
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
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	@Override
	public String toString() {
		return "CreatePlain [cID=" + cID + ", fname=" + fname + ", lname=" + lname + ", pname=" + pname + "]";
	}
	

}
