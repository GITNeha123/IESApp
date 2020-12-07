package com.del.ies.dc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="DC_PLANS")
public class CreatePlanEntity {
	@Id
	@Column(name="cID",length=40)
	private Integer cID;
	
	@Column(name="F_NAME",length=40)
	private String fname;
	
	@Column(name="L_NAME",length=40)
	private String lname;
	
	@Column(name="PLAN_NAME",length=40)
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
		return "CreatePlanEntity [cID=" + cID + ", fname=" + fname + ", lname=" + lname + ", pname=" + pname + "]";
	}

}
