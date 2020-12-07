package com.del.ies.batch.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Data
@Table(name="BATCH_Dtls")
public class BatchEntity {
	@Id
	@Column(name="BATCH_RUN_SEQ",length=255)
	private Integer batchId;
	
	@Column(name="BATCH_NAME",length=255)
	private String bName;
	
	@Column(name="BATCH_RUN_STATUS",length=40)
	private String bStatus;
	
	@Column(name="END_DATE",length=10)
	private String bEnd;
	
	@Column(name="INSTANCE_NO",length=10)
	private String iNo;
	
	@Column(name="START_DATE",length=10)
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
		return "BatchEntity [batchId=" + batchId + ", bName=" + bName + ", bStatus=" + bStatus + ", bEnd=" + bEnd
				+ ", iNo=" + iNo + ", sDate=" + sDate + "]";
	}
	
	

}
