package com.del.ies.admin.controller;

import java.util.List;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.del.ies.admin.domain.AdminAcc;
import com.del.ies.admin.service.AdminAccService;

@Controller
public class AdminAccController {
	 private static final org.jboss.logging.Logger logger = LoggerFactory.logger(AdminAccController.class);
	@Autowired
	private AdminAccService adService;
	
	@GetMapping(value= {"loadForm"})
	 public String loadForm(Model model) {
		model.addAttribute("account", new AdminAcc());
		 return "admin";
	 } // to display form

	@PostMapping(value="/saveAcc")
	 public String saveAccount(@ModelAttribute("account") AdminAcc account,Model model) {
		logger.info("Controller saveAccount() called......................");
		String res="";
		boolean isSaved=adService.save(account);
		if(isSaved) {
			if(account.getId()!=null) {
				model.addAttribute("UPDATE_MSG", "Account Updated succefully...");
				//	res="editAcc";
			}
			else {
				logger.info("Controller Account has Saved() called......................");
				model.addAttribute("SUCC_MSG", "Your Account is almost completed.Please check your mail and proced  your Account");
				//res="admin";
			}
			}
		return "admin";
			} // save 
	
	
	@GetMapping("/viewAccounts")
	 public String handleViewCtctsHyperlink(Model model) { // hyperlink
		List<AdminAcc> allAccts=adService.getAllAccount();
		model.addAttribute("accounts", allAccts);
		  return "viewAcc";
	 }
	
	@GetMapping("/uniqueEmail")
	 public @ResponseBody String isUniqueEmail(@RequestParam("email") String email,Model model) { // hyperlink
		System.out.println("===Controller isUniqueEmail() called=================================================="+email);
		//logger.info("Controller isUniqueEmail() called......................");
		String result=null;
		boolean status=	adService.isUniqueemail(email);
		
	if(status)
		result="DUPLICATE";
	else
		result="UNIQUE";
		  return result;
	 }
}

