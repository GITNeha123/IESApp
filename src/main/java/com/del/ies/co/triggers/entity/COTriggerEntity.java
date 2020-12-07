package com.del.ies.co.triggers.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "CO_TRIGGERS")
public class COTriggerEntity {
	@Id
	@Column(name = "TRI_ID", length = 10)
	private Integer tId;
	
	@Column(name = "CASE_NO", length = 10)
	private String cNo;
	
	@Column(name = "TRI_STATUS", length = 10)
	private String triStatus;
	
	@Column(name = "CREATE_DATE", length = 10)
	private String cDate;

	@Column(name = "UPDATE_DATE", length = 10)
	private String upDate;

	public Integer gettId() {
		return tId;
	}

	public void settId(Integer tId) {
		this.tId = tId;
	}

	public String getcNo() {
		return cNo;
	}

	public void setcNo(String cNo) {
		this.cNo = cNo;
	}

	public String getTriStatus() {
		return triStatus;
	}

	public void setTriStatus(String triStatus) {
		this.triStatus = triStatus;
	}

	public String getcDate() {
		return cDate;
	}

	public void setcDate(String cDate) {
		this.cDate = cDate;
	}

	public String getUpDate() {
		return upDate;
	}

	public void setUpDate(String upDate) {
		this.upDate = upDate;
	}

	@Override
	public String toString() {
		return "CO_Entity [tId=" + tId + ", cNo=" + cNo + ", triStatus=" + triStatus + ", cDate=" + cDate + ", upDate="
				+ upDate + "]";
	}

}
