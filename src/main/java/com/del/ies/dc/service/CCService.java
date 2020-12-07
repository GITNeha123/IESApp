package com.del.ies.dc.service;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.del.ies.admin.controller.ViewAdminController;
import com.del.ies.ar.domain.Registration;
import com.del.ies.ar.service.ARService;
import com.del.ies.dc.domain.CreateCase;
import com.del.ies.dc.domain.CreatePlan;
import com.del.ies.dc.domain.IncomePln;

@Service
public interface CCService {

	public Registration getAccById(String id);

	public boolean saveUser(CreateCase ccuser);

	public boolean savePlnDtls(CreatePlan cp);

	public boolean saveincmeDtls(IncomePln ip);

	public CreateCase getDataByCid(Integer cid);

	public Registration saveCaseByCId(CreateCase ccuser);
	
}
