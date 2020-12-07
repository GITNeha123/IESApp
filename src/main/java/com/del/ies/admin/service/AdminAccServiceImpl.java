package com.del.ies.admin.service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.del.ies.admin.controller.AdminAccController;
import com.del.ies.admin.domain.AdminAcc;
import com.del.ies.admin.domain.Plan;
import com.del.ies.admin.entity.AdminAccEntity;
import com.del.ies.admin.entity.PlanEntity;
import com.del.ies.admin.repository.AdminAccRepository;
import com.del.ies.admin.repository.PlainRegistrationRepo;


@Service
public class AdminAccServiceImpl implements AdminAccService {
	 private static final org.jboss.logging.Logger logger = LoggerFactory.logger(AdminAccController.class);
		
	@Autowired
private AdminAccRepository accRepo;
	
	@Autowired
private PlainRegistrationRepo plRepo;
	
	@Autowired
	private	com.del.ies.utils.EmailUtils utils;
	
	
	@Override
	public boolean save(AdminAcc acc) {
		// TODO Auto-generated method stub
		boolean msg=false;
		AdminAccEntity accEntity=new AdminAccEntity();
		BeanUtils.copyProperties(acc, accEntity);
		AdminAccEntity entity=	accRepo.save(accEntity);
		if(entity.getId()!=null) {
		System.out.println("====================================================="+entity.getEmail());
		String to=acc.getEmail();
		String subject="IES Login Details || Registration Successful";
			String body=getRegMailBody(acc);
		utils.sendEmail(to, subject, body);
		System.out.println("-------------------------"+entity.toString());
		 msg=true ;
 	}
return msg;
	}

	

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		accRepo.deleteById(id);
		System.out.println("-----Service----deleteById(Integer id)----------------");

	}

	@Override
	public List<AdminAcc> getAllAccount() {
		// TODO Auto-generated method stub
		List<AdminAcc> accList=new ArrayList<AdminAcc>();
		List<AdminAccEntity> entityList=accRepo.findAll();
		entityList.forEach(entity->{
			AdminAcc acc=new AdminAcc();
			BeanUtils.copyProperties(entity,acc);
			accList.add(acc);
			});
		return accList;
	}
	
	@Override
	public List<AdminAcc> getAccByRole(String role) {
		// TODO Auto-generated method stub
		List<AdminAcc> accList=new ArrayList<AdminAcc>();
		logger.info("accRepo getAccByRole() called........--------");
		List<AdminAccEntity> entityList=accRepo.findByRole(role);
		entityList.forEach(entity->{
			AdminAcc acc=new AdminAcc();
			BeanUtils.copyProperties(entity,acc);
			accList.add(acc);
			});
		return accList;
	}

	@Override
	public boolean updateAcc(AdminAcc acc) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public AdminAcc getAccById(Integer id) {
		// TODO Auto-generated method stub
		System.out.println("-------------Service------getAccById()--------------");

		Optional<AdminAccEntity> opt=accRepo.findById(id);
		if(opt.isPresent()) {
			AdminAccEntity entity=opt.get();
			AdminAcc acc=new AdminAcc();
			BeanUtils.copyProperties(entity, acc);
			System.out.println("-------------ServiceEdit------getAccById()--------------"+acc);

			return acc;
		}
		
		
		return null;
	}


	@Override
	public boolean isUniqueemail(String mail) {
		// TODO Auto-generated method stub
		AdminAccEntity entity=	accRepo.findByEmail(mail);
		System.out.println("====================================================="+entity.getEmail());
		if(entity.getEmail()==mail)
			return true;
		else
		
		return false;
	}


	

	

	@Override
	public String sendPwdToEmail(String to, String subject, String body) {
		return body;
		
			


	
	}


	@Override
	public String getRecoverPWDMailBody(AdminAcc user) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String getRegMailBody(AdminAcc user) {
		// TODO Auto-generated method stub
		logger.info("serviceImpl getMailReg() called");
		String fileName = "UNLOCK-ACC-EMAIL-BODY-TEMPLATE.txt";
		List<String> replacedLines = null;
		String mailBody = null;
		try {
			Path path = Paths.get(fileName, "");
			Stream<String> lines = Files.lines(path);

			replacedLines = lines.map(line -> line.replace("{FNAME}", user.getFname())
								 .replace("{LNAME}", user.getLname())
								 .replace("{PWD}", user.getPwd())
								 .replace("{ROLE}", user.getRole())
								 .replace("{EMAIL}", user.getEmail()))
								 .collect(Collectors.toList());

			mailBody = String.join("", replacedLines);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return mailBody;
	}



	@Override
	public boolean savePlan(Plan plan) {
		// TODO Auto-generated method stub
				PlanEntity  entity =new PlanEntity ();
				BeanUtils.copyProperties(plan, entity);
				PlanEntity saveEntity=plRepo.save(entity);
				
				
				return saveEntity.getId()!=null;
				
				
	}



	@Override
	public void deletePlanById(Integer id) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public List<Plan> getAllPlan() {
		logger.info("========================================serviceImpl getAllPlan() called");
		List<Plan> accList=new ArrayList<Plan>();
		List<PlanEntity> entityList=plRepo.findAll();
		entityList.forEach(entity->{
			Plan acc=new Plan();
			BeanUtils.copyProperties(entity,acc);
			accList.add(acc);
			});
		return accList;
	}



	@Override
	public boolean updatePlain(Plan plan) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public Plan getPlainById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}



	
}