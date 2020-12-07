package com.del.ies.ar.controller;

import java.util.List;
import java.util.Optional;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.del.ies.admin.controller.ViewAdminController;
import com.del.ies.admin.domain.AdminAcc;
import com.del.ies.admin.service.AdminAccService;
import com.del.ies.ar.domain.Registration;
import com.del.ies.ar.entity.RegistrationEntity;
import com.del.ies.ar.repository.RegistrationRepo;
import com.del.ies.ar.service.ARService;

@Controller
public class ViewARController {
	private static final org.jboss.logging.Logger logger = LoggerFactory.logger(ViewAdminController.class);
	@Autowired
	private ARService arService;

	@Autowired
	private RegistrationRepo arRepo;

	@GetMapping("/editARR")
	public String updateResgitration(@RequestParam("arID") String arID, Model model) {
		System.out.println("===========id=======================" + arID);
      Registration result = arService.getAccById(arID);
      System.out.println("===========Controller updateResgitration=======================" + result.getArID());
		model.addAttribute("registration", result);

		return "registraion";
	}

	@GetMapping("/deleteAR")
	public String deleteContactssss(@RequestParam("arID") String cid, Model model) {
		// arService.deleteById(cid);
		// attribute.addFlashAttribute("delmsg", "Account has been deleted
		// successfully");
		model.addAttribute("delmsg", "Account has been deleted successfully");
		// return "redirect:/viewAcc";
		return "viewReg";
	}

	/*
	 * It displays object data into form for the given id. The @PathVariable puts
	 * URL data into variable. // show update form
	 * 
	 * @RequestMapping(value = "/users/{id}/update", method = RequestMethod.GET)
	 * public String showUpdateUserForm(@PathVariable("id") int id, Model model) {
	 * 
	 * logger.debug("showUpdateUserForm() : {}", id);
	 * 
	 * User user = userService.findById(id); model.addAttribute("userForm", user);
	 * 
	 * populateD efaultModel(model);
	 * 
	 * return "users/userform";
	 * 
	 * }
	 */

}
