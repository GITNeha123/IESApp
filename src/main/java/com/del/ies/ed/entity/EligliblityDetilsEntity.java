package com.del.ies.ed.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "ED_Dtls")
public class EligliblityDetilsEntity {
	@Id
	@Column(name = "ED_ID", length = 10)
	private Integer edId;
	
	@Column(name = "BENIFIT_AMT", length = 10)
	private String bAmt;
	
	@Column(name = "CASE_ID", length = 10)
	private String cID;
	
	@Column(name = "CREATE_DATE", length = 10)
	private String cDate;
	
	@Column(name = "DENIAL_REASON", length = 255)
	private String dReason;
	
	@Column(name = "PLAN_END_DATE", length = 10)
	private String pEndDate;
	
	@Column(name = "PLAN_NAME", length = 255)
	private String pName;
	
	@Column(name = "PLAN_START_DATE", length = 10)
	private String pStartDate;
	
	@Column(name = "PLAN_STATUS", length = 25)
	private String pStatus;
	
	@Column(name = "UPDATE_DATE", length = 10)
	private String upDate;

	public Integer getEdId() {
		return edId;
	}

	public void setEdId(Integer edId) {
		this.edId = edId;
	}

	public String getbAmt() {
		return bAmt;
	}

	public void setbAmt(String bAmt) {
		this.bAmt = bAmt;
	}

	public String getcID() {
		return cID;
	}

	public void setcID(String cID) {
		this.cID = cID;
	}

	public String getcDate() {
		return cDate;
	}

	public void setcDate(String cDate) {
		this.cDate = cDate;
	}

	public String getdReason() {
		return dReason;
	}

	public void setdReason(String dReason) {
		this.dReason = dReason;
	}

	public String getpEndDate() {
		return pEndDate;
	}

	public void setpEndDate(String pEndDate) {
		this.pEndDate = pEndDate;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpStartDate() {
		return pStartDate;
	}

	public void setpStartDate(String pStartDate) {
		this.pStartDate = pStartDate;
	}

	public String getpStatus() {
		return pStatus;
	}

	public void setpStatus(String pStatus) {
		this.pStatus = pStatus;
	}

	public String getUpDate() {
		return upDate;
	}

	public void setUpDate(String upDate) {
		this.upDate = upDate;
	}

	@Override
	public String toString() {
		return "EligliblityDetilsEntity [edId=" + edId + ", bAmt=" + bAmt + ", cID=" + cID + ", cDate=" + cDate
				+ ", dReason=" + dReason + ", pEndDate=" + pEndDate + ", pName=" + pName + ", pStartDate=" + pStartDate
				+ ", pStatus=" + pStatus + ", upDate=" + upDate + "]";
	}

}
