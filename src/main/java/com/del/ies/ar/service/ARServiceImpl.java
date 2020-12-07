package com.del.ies.ar.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.del.ies.admin.controller.AdminAccController;
import com.del.ies.admin.domain.AdminAcc;
import com.del.ies.admin.entity.AdminAccEntity;
import com.del.ies.admin.repository.AdminAccRepository;
import com.del.ies.ar.domain.Registration;
import com.del.ies.ar.entity.RegistrationEntity;
import com.del.ies.ar.repository.RegistrationRepo;
import com.del.ies.ar.responseBinding.Enrollment;
import com.del.ies.exception.NoDataFoundException;

@Service
public class ARServiceImpl implements ARService {

	private static final org.jboss.logging.Logger logger = LoggerFactory.logger(AdminAccController.class);

	@Autowired
	private RegistrationRepo arRepo;

	

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		arRepo.deleteById(id);
		System.out.println("-----Service----deleteById(Integer id)----------------");

	}

	@Override
	public List<Registration> getAllAccount() {
		// TODO Auto-generated method stub
		List<Registration> accList = new ArrayList<Registration>();
		List<RegistrationEntity> entityList = arRepo.findAll();
		entityList.forEach(entity -> {
			Registration acc = new Registration();
			BeanUtils.copyProperties(entity, acc);
			accList.add(acc);
		});
		return accList;

	}

	@Override
	public boolean updateAcc(Registration reg) {
		// TODO Auto-generated method stub
		boolean msg = false;
		RegistrationEntity regEntity = new RegistrationEntity();
		BeanUtils.copyProperties(reg, regEntity);
		RegistrationEntity entity = arRepo.save(regEntity);
		if (entity.getArID() != null) {
			System.out.println("=====================================================" + entity.getEmail());
			System.out.println("-------------------------" + entity.toString());
			msg = true;
		}
		return msg;

	}

	

	@Override
	public Enrollment verifySSN(Long val) {

		HttpHeaders headers = new HttpHeaders();
		Enrollment bdy = null;
		String endPointURL = "http://localhost:5151/getSSN/" + val;
		System.out.println("================================Af====================================");
		RestTemplate rest = new RestTemplate();
		headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));
		// Request to return JSON format
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("my_other_key", "my_other_value");

		// HttpEntity<String>: To get result as String.

		HttpEntity<Enrollment> entity = new HttpEntity<Enrollment>(headers);
	
		ResponseEntity<Enrollment> resEntity = rest.exchange(endPointURL, //
				HttpMethod.GET, entity, Enrollment.class);

		int status = resEntity.getStatusCodeValue();
		if (status == 200) {
			bdy = resEntity.getBody();
			System.out.println(bdy);
		} else {
			throw new NoDataFoundException();

		}
		return bdy;
	}

	@Override
	public String save(Registration reg) {
		// TODO Auto-generated method stub
		 String msg = null;
			RegistrationEntity entity=null;
			Enrollment enroll = verifySSN(reg.getSsn());
			if (enroll.getSsn() != null && enroll.getSsn().equals(reg.getSsn())) {
				if (enroll.getStateName().equals("KT")) {
					RegistrationEntity regEntity = new RegistrationEntity();
					BeanUtils.copyProperties(reg, regEntity);
				 entity = arRepo.save(regEntity);
					if (entity.getArID() != null) {
						System.out.println("=====================================================" + entity.getEmail());
						System.out.println("-------------------------" + entity.toString());
						System.out.println("-------service-AR-----------------" + entity.getArID());
						 msg =entity.getArID();
					}

				}
		
			

		}
		return msg;
	}

	@Override
	public Registration getAccById(String id) {
		
		// TODO Auto-generated method stub
		RegistrationEntity opt =arRepo.findByArID(id);
		System.out.println("=======================getAccById(String id)======================"+opt);
		if (opt!=null) {
			Registration res = new Registration();
			BeanUtils.copyProperties(opt, res);
			System.out.println("-------------ServiceEdit------getAccById()--------------" +res);

			return res;

		}
		
		return null;
	}
}
