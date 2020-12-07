package com.del.ies.batch.service;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.del.ies.admin.controller.AdminAccController;
import com.del.ies.admin.entity.AdminAccEntity;
import com.del.ies.admin.repository.AdminAccRepository;
import com.del.ies.batch.domain.COBatchDtls;
import com.del.ies.batch.entity.BatchEntity;
import com.del.ies.batch.repo.BatchRepository;

@Service
public class COGenBatchServiceImpl implements COGenBatch{
 private static final org.jboss.logging.Logger logger = LoggerFactory.logger(AdminAccController.class);
		
	@Autowired
	private BatchRepository bRepo;

	@Override
	public COBatchDtls preProcess(COBatchDtls bDtls) {
		// TODO Auto-generated method stub
		BatchEntity entity=new  BatchEntity();
		BeanUtils.copyProperties(bDtls, entity);
		bDtls.setBatchId(1);
		BatchEntity saveEntity=bRepo.save(entity);
		if(saveEntity.getBatchId()!=null) {
			COBatchDtls dtls=new  COBatchDtls();
			BeanUtils.copyProperties(entity,dtls);
			return dtls;
		}
		
		
		return null;
	}

	@Override
	public boolean start(COBatchDtls bDtls) {
		// TODO Auto-generated method stub
		
		return false;
	}

	@Override
	public boolean postProcess(COBatchDtls bDtls) {
		// TODO Auto-generated method stub
		return false;
	}

}