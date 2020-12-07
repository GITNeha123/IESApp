package com.del.ies.co.triggers.service;

import java.util.Optional;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.del.ies.admin.controller.AdminAccController;
import com.del.ies.admin.domain.AdminAcc;
import com.del.ies.admin.entity.AdminAccEntity;
import com.del.ies.batch.domain.COBatchDtls;
import com.del.ies.batch.repo.BatchRepository;
import com.del.ies.co.triggers.domain.COTrigger;
import com.del.ies.co.triggers.entity.COTriggerEntity;
import com.del.ies.co.triggers.repo.TriggerRepository;

public class COTriggersServiceImpl implements COTriggersService{
	private static final org.jboss.logging.Logger logger = LoggerFactory.logger(COTriggersServiceImpl.class);
	
	@Autowired
	private TriggerRepository tRepo;

	@Override
	public COTrigger start(Integer ct) {
		// TODO Auto-generated method stub
		COTriggerEntity entity=tRepo.findByTriStatus(ct);
		if(entity.gettId()!=null) {
			
			COTrigger acc=new COTrigger();
			BeanUtils.copyProperties(entity, acc);
			System.out.println("-------------ServiceEdit------getAccById()--------------"+acc);

			return acc;
		}
		
		
		
		return null;
	}

	

	

}
