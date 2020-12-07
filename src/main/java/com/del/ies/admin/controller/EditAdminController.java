package com.del.ies.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.del.ies.admin.domain.AdminAcc;
@Controller
public class EditAdminController {
	
	@GetMapping(value="/editForm")
	 public String loadForm(Model model) {
		 AdminAcc account=new AdminAcc();
		model.addAttribute("accounts", new AdminAcc());
		 return "editAcc";
	 } // to display form


}
