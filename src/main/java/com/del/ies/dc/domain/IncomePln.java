package com.del.ies.dc.domain;

public class IncomePln {
	
	private Integer cID;
	private String name;
	private String emp;
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
		return "IncomePln [cID=" + cID + ", name=" + name + ", emp=" + emp + ", incme=" + incme + "]";
	}

}
