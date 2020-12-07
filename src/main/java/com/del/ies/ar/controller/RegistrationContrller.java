package com.del.ies.ar.controller;

import java.util.List;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.del.ies.admin.controller.AdminAccController;
import com.del.ies.admin.domain.AdminAcc;
import com.del.ies.admin.service.AdminAccService;
import com.del.ies.ar.domain.Registration;
import com.del.ies.ar.service.ARService;
import com.del.ies.generator.EnrlmentGenerator;

@Controller
public class RegistrationContrller {
	private static final org.jboss.logging.Logger logger = LoggerFactory.logger(AdminAccController.class);
	@Autowired
	private ARService arService;
	@Autowired
	private EnrlmentGenerator generattor;

	@GetMapping(value = { "/registraion" })
	public String loadForm(Model model) {

		model.addAttribute("registration", new Registration());
		return "registraion";
	} // to display form

	@PostMapping(value = "/saveRegistration")
	public String saveAccount(@ModelAttribute("registration") Registration registration, Model model,
			RedirectAttributes attributes) {
		String res = null;
		boolean isNewReg = false;
		logger.info("Controller saveAccount() called......................");

		if (registration.getArID() == null)
			isNewReg = true;
		try {
		
		res = arService.save(registration);
		if (isNewReg) {

			// if(res!=null)
			// {
			logger.info("save() called==================================");

			System.out.println("AR_ID=====================================" + registration.getArID());

			attributes.addFlashAttribute("succ", "Record Saved Successfully.." + res);

		} else if (!isNewReg)
			attributes.addFlashAttribute("succ", "Record Updated Successfully..");

		else 
			attributes.addFlashAttribute("err", "Fail");
		
		}
		catch(Exception e) {
		//else {
			attributes.addFlashAttribute("err", "Fail");
			// attributes.addFlashAttribute("succ", "Record Updated Successfully..");
			//}
		}
		return "redirect:/succMSG";

	} // save

	@GetMapping(value = "/succMSG")
	public String getSuccMSG(Model model) {
		model.addAttribute("registration", new Registration());

		return "registraion";

	}

	@GetMapping("/viewRegistraion")
	public String handleRegistraionHyperlink(Model model) { // hyperlink
		logger.info("========================Controller viewRegistraion() called..............");
		List<Registration> allAccts = arService.getAllAccount();
		model.addAttribute("registration", allAccts);
		System.out.println("=======Controller handleRegistraionHyperlink() called=================" + allAccts);
		return "viewReg";
	}

}
