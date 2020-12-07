package com.del.ies.admin.service;

import java.util.List;

import com.del.ies.admin.domain.AdminAcc;
import com.del.ies.admin.domain.Plan;

public interface AdminAccService {
	public boolean save(AdminAcc acc);

	public void deleteById(Integer id);

	public List<AdminAcc> getAllAccount();

	public boolean updateAcc(AdminAcc acc);

	public AdminAcc getAccById(Integer id);

	public boolean isUniqueemail(String mail);

	public List<AdminAcc> getAccByRole(String role);

	
	// Email
	public String getRecoverPWDMailBody(AdminAcc user);

	public String getRegMailBody(AdminAcc user);

	public String sendPwdToEmail(String to, String subject, String body);

	// Plain
	public boolean savePlan(Plan plan);

	public void deletePlanById(Integer id);

	public List<Plan> getAllPlan();

	public boolean updatePlain(Plan plan);

	public Plan getPlainById(Integer id);

}
