package com.del.ies.admin.controller;

import java.util.List;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.del.ies.admin.domain.AdminAcc;
import com.del.ies.admin.domain.Plan;
import com.del.ies.admin.service.AdminAccService;

@Controller
public class CreatePlainController {
	
	private static final org.jboss.logging.Logger logger = LoggerFactory.logger(CreatePlainController.class);
	@Autowired
	private AdminAccService adService;
	
	@GetMapping(value="/homePlan")
	 public String loadForm(Model model) {
		// AdminAcc account=new AdminAcc();
		model.addAttribute("plan", new Plan());
		 return "newPlan";
	 } // to display form
	
	@PostMapping("/savePlan")
	public String handleRegistrationtBtn(@ModelAttribute("plan") Plan plan, Model model) {
		logger.info("handleRegistrationtBtn() Controller================================================");
		//System.out.println(user.getGender()+""+user.getDob()+""+user.getCityId()+""+user.getCountryId()+""+user.getStateId());
		boolean isSaved=adService.savePlan(plan);
		if(isSaved) {
			logger.info("Email sent successfully Controller");
			// model.addAttribute(AppConstant.SUCC_KEY,AppConstant.SUCC_MSG);
			model.addAttribute("SUCC_MSG", "Your Plan Registered Successfull");
			
		}else {
			//model.addAttribute(AppConstant.ERR_KEY, AppConstant.ERR_MSG);
		}
		return "newPlan";
		}
	


	@GetMapping("/viewPlan")
	 public String handleViewPlanHyperlink(Model model) { // hyperlink
		logger.info("handleViewPlanHyperlink() Controller===============================================");
		List<Plan> list=adService.getAllPlan();
		model.addAttribute("list", list);
		System.out.println("====================handleViewPlanHyperlink() Controller======================"+list);
		  return "viewPlan";
	 }
}
