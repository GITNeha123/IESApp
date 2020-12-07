package com.del.ies.dc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="DC_INCME")
public class IncomePlnEntity {
	
	@Id
	@Column(name="cID",length=40)
	private Integer cID;
	
	@Column(name="NAME",length=40)
	private String name;
	
	@Column(name="EMP",length=40)
	private String emp;
	
	@Column(name="INCME",length=40)
	private String incme;
	
	public Integer getcID() {
		return cID;
	}
	public void setcID(Integer cID) {
		this.cID = cID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmp() {
		return emp;
	}
	public void setEmp(String emp) {
		this.emp = emp;
	}
	public String getIncme() {
		return incme;
	}
	public void setIncme(String incme) {
		this.incme = incme;
	}
	@Override
	public String toString() {
		return "IncomePlnEntity [cID=" + cID + ", name=" + name + ", emp=" + emp + ", incme=" + incme + "]";
	}
}
