package com.del.ies.co.triggers.domain;

import javax.persistence.Column;
import javax.persistence.Id;

public class COTrigger {
	
	private Integer tId;
	private String cNo;
	private String triStatus;
	private String cDate;
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
		return "COTrigger [tId=" + tId + ", cNo=" + cNo + ", triStatus=" + triStatus + ", cDate=" + cDate + ", upDate="
				+ upDate + "]";
	}


}
