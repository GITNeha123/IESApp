package com.del.ies.co.entity;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="CO_PDF_Dtls")
public class COPDFEntity {
	
	@Id
	@Column(name="BATCH_RUN_SEQ",length=255)
	private Integer cPDFId;

	@Column(name="PLAN_STATUS",length=40)
	private String planStatus;
	
	@Column(name="CASE_NO",length=10)
	private String caseNo;
	
	@Column(name="PDF_DOC",length=10)
	private Blob pdfDoc;
	
	@Column(name="PLAN_NAME",length=255)
	private String planName;

	public Integer getcPDFId() {
		return cPDFId;
	}

	public void setcPDFId(Integer cPDFId) {
		this.cPDFId = cPDFId;
	}

	public String getPlanStatus() {
		return planStatus;
	}

	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}

	public String getCaseNo() {
		return caseNo;
	}

	public void setCaseNo(String caseNo) {
		this.caseNo = caseNo;
	}

	public Blob getPdfDoc() {
		return pdfDoc;
	}

	public void setPdfDoc(Blob pdfDoc) {
		this.pdfDoc = pdfDoc;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	@Override
	public String toString() {
		return "CO_PDF_Entity [cPDFId=" + cPDFId + ", planStatus=" + planStatus + ", caseNo=" + caseNo + ", pdfDoc="
				+ pdfDoc + ", planName=" + planName + "]";
	}


}
