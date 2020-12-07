package com.del.ies.dc.Controller;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.del.ies.admin.controller.ViewAdminController;
import com.del.ies.admin.service.AdminAccService;
import com.del.ies.ar.domain.Registration;
import com.del.ies.ar.entity.RegistrationEntity;
import com.del.ies.ar.service.ARService;
import com.del.ies.dc.domain.CreateCase;
import com.del.ies.dc.domain.CreatePlan;
import com.del.ies.dc.service.CCService;

@Controller
public class CaseCreateController {
	 private static final org.jboss.logging.Logger logger = LoggerFactory.logger(CaseCreateController.class);
		
		@Autowired
		private CCService ccService;
		Registration registration;
		
		@GetMapping(value="/createCase")
		 public String loadForm(Model model) {
			 return "createCase";
		 } // to display form

		@GetMapping("/validteAR")
		public String validateByArNo(HttpServletRequest req, Model model) {
			logger.info("===============validateByArNo Controller.......................");
		
			String arID=req.getParameter("rID");
			System.out.println("arID before calling ccService ========="+arID);
			Registration registration	=ccService.getAccById(arID);
			System.out.println("arID after calling ccService ========="+registration.getArID());
	
			
			CreateCase res = new CreateCase();
			res.setrID(registration.getArID());
			res.setName(registration.getFname()+ registration.getLname());
			BeanUtils.copyProperties(registration, res);
			
			if(registration.getArID().equals(arID)) {
				model.addAttribute("ccse",res);
			}
			else {
				model.addAttribute("err","FAIL");
			}
			return "createCase";
			}
		
		@PostMapping("/sveCse")
		 public String handleSubmitBtn(@ModelAttribute("ccse") CreateCase c, RedirectAttributes model,Model m) { // form submission
			logger.info("Case is saving =================@@");
			 System.out.println("before save in Controller=============================="+c);
			String res="";
			 boolean isSaved=ccService.saveUser(c);
			
			System.out.println("Controller  saveCaase() called==============================="+registration);
			if(isSaved) {
				if(c.getcID()!=null) {
					
					
					model.addFlashAttribute("susmsg","Case has Updated succefully...");

				}
				else {
					model.addFlashAttribute("susmsg","Case has Saved succefully...");
					 logger.info("Contact is saved successfully=================@@");
				}
				}
				else
					model.addFlashAttribute("errmsg","Case did not Saved...");
			//	 return "index";
				 return "redirect:cratePlan";
		 } 
		
		
		
		
		
		
		
		
}
