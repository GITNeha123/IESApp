package com.del.ies.admin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="Plain_Dtls")
public class PlanEntity {
	
	@Id
	@Column(name="id",length=10)
	@GeneratedValue
	private Integer id;
	
	@Column(name="PLAIN_NAME",length=40)
	private String pname;
	
	@Column(name="PLAIN_DES",length=60)
	private String pDes;
	
	@Column(name="START_DATE",length=20)
	private String sDate;
	
	@Column(name="END_DATE",length=20)
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
		return "PlanEntity [id=" + id + ", pname=" + pname + ", pDes=" + pDes + ", sDate=" + sDate + ", eDate=" + eDate
				+ "]";
	}

}
