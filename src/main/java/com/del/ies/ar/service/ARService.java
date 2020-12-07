package com.del.ies.ar.service;

import java.util.List;

import com.del.ies.admin.domain.AdminAcc;
import com.del.ies.ar.domain.Registration;
import com.del.ies.ar.responseBinding.Enrollment;

public interface ARService {

	public String save(Registration reg);

	public void deleteById(Integer id);

	public List<Registration> getAllAccount();

	public boolean updateAcc(Registration reg);

	public Registration getAccById(String id);
	public  Enrollment verifySSN(Long val);
}
