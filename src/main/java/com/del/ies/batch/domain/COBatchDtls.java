package com.del.ies.batch.domain;

import javax.persistence.Column;

public class COBatchDtls {

	private Integer batchId;
	private String bName;
	private String bStatus;
	private String bEnd;
	private String iNo;
	private String sDate;

	public Integer getBatchId() {
		return batchId;
	}

	public void setBatchId(Integer batchId) {
		this.batchId = batchId;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getbStatus() {
		return bStatus;
	}

	public void setbStatus(String bStatus) {
		this.bStatus = bStatus;
	}

	public String getbEnd() {
		return bEnd;
	}

	public void setbEnd(String bEnd) {
		this.bEnd = bEnd;
	}

	public String getiNo() {
		return iNo;
	}

	public void setiNo(String iNo) {
		this.iNo = iNo;
	}

	public String getsDate() {
		return sDate;
	}

	public void setsDate(String sDate) {
		this.sDate = sDate;
	}

	@Override
	public String toString() {
		return "COBatchDtls [batchId=" + batchId + ", bName=" + bName + ", bStatus=" + bStatus + ", bEnd=" + bEnd
				+ ", iNo=" + iNo + ", sDate=" + sDate + "]";
	}

}
