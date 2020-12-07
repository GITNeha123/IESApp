package com.del.ies.batch.service;

import com.del.ies.admin.domain.AdminAcc;
import com.del.ies.batch.domain.COBatchDtls;

public interface COGenBatch {
	public COBatchDtls preProcess(COBatchDtls bDtls);
	
	public boolean postProcess(COBatchDtls bDtls);

}
