package com.del.ies.dc.service;

import java.util.Optional;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.del.ies.admin.controller.AdminAccController;
import com.del.ies.ar.domain.Registration;
import com.del.ies.ar.entity.RegistrationEntity;
import com.del.ies.ar.repository.RegistrationRepo;
import com.del.ies.ar.service.ARService;
import com.del.ies.dc.domain.CreateCase;
import com.del.ies.dc.domain.CreatePlan;
import com.del.ies.dc.domain.IncomePln;
import com.del.ies.dc.entity.CreateCaseEntity;
import com.del.ies.dc.entity.CreatePlanEntity;
import com.del.ies.dc.entity.IncomePlnEntity;
import com.del.ies.dc.repository.CaseCreateRepo;
import com.del.ies.dc.repository.CreatePlanRepo;
import com.del.ies.dc.repository.IncmeRepo;

@Component
public class CCServiceImpl implements CCService {
	private static final org.jboss.logging.Logger logger = LoggerFactory.logger(CCServiceImpl.class);

	@Autowired
	private CaseCreateRepo ccRepo;
	@Autowired
	private RegistrationRepo arRepo;
	@Autowired
	private CreatePlanRepo cpRepo;

	@Autowired
	private IncmeRepo inRepo;

	@Override
	public Registration getAccById(String arID) {
		// TODO Auto-generated method stub
		logger.info("..........CaseCreate Service  .............");

		RegistrationEntity opt = arRepo.findByArID(arID);

		if (opt != null) {
			Registration res = new Registration();
			BeanUtils.copyProperties(opt, res);
			System.out.println("-------------Service CaseCreate----------------getAccById()--------------" + res);

			return res;

		}

		return null;
	}

	@Override
	public boolean saveUser(CreateCase ccuser) {
		// TODO Auto-generated method stub
		// this method is used to save recrods
		CreateCaseEntity entity = new CreateCaseEntity();
		BeanUtils.copyProperties(ccuser, entity);
		CreateCaseEntity saveEntity = ccRepo.save(entity);
		System.out.println("service saveUser=================================" + saveEntity);

		return saveEntity.getcID() != null;

	}

	@Override
	public boolean savePlnDtls(CreatePlan cp) {
		// TODO Auto-generated method stub
		CreatePlanEntity entity = new CreatePlanEntity();
		BeanUtils.copyProperties(cp, entity);
		CreatePlanEntity saveEntity = cpRepo.save(entity);
		System.out.println("=====service savePlnDtls=================================" + saveEntity);

		return saveEntity.getcID() != null;
	}

	
	@Override
	public boolean saveincmeDtls(IncomePln ip) {
		// TODO Auto-generated method stub
		IncomePlnEntity entity = new IncomePlnEntity();
		BeanUtils.copyProperties(ip, entity);
		IncomePlnEntity saveEntity = inRepo.save(entity);
		System.out.println("service saveincmeDtls=================================" + saveEntity);
		return saveEntity.getcID() != null;
	}

	@Override
	public CreateCase getDataByCid(Integer cid) {
		// TODO Auto-generated method stub
		Optional<CreateCaseEntity> opt = ccRepo.findById(cid);
		if (opt != null) {
			CreateCase res = new CreateCase();
			BeanUtils.copyProperties(opt, res);
			System.out.println("-------------Service CaseCreate----------------getAccById()--------------" + res);
			return res;
		}
		return null;
	}

	@Override
	public Registration saveCaseByCId(CreateCase ccuser) {
		// TODO Auto-generated method stub
		CreateCaseEntity entity = new CreateCaseEntity();
		BeanUtils.copyProperties(ccuser, entity);
		CreateCaseEntity saveEntity = ccRepo.save(entity);
		System.out.println("service saveUser=================================" + saveEntity);
		 Registration reg=new  Registration();
		 BeanUtils.copyProperties(saveEntity, reg);
		 
		return reg;
		}

	

}
