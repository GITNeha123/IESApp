package com.del.ies.admin.domain;

public class Plan {
	private Integer id;
	private String pname;
	private String pDes;
	private String sDate;
	private String eDate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getpDes() {
		return pDes;
	}
	public void setpDes(String pDes) {
		this.pDes = pDes;
	}
	public String getsDate() {
		return sDate;
	}
	public void setsDate(String sDate) {
		this.sDate = sDate;
	}
	public String geteDate() {
		return eDate;
	}
	public void seteDate(String eDate) {
		this.eDate = eDate;
	}
	@Override
	public String toString() {
		return "Plan [id=" + id + ", pname=" + pname + ", pDes=" + pDes + ", sDate=" + sDate + ", eDate=" + eDate + "]";
	}
	

}
