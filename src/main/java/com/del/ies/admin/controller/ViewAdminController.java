package com.del.ies.admin.controller;

import java.util.List;

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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.del.ies.admin.domain.AdminAcc;
import com.del.ies.admin.repository.AdminAccRepository;
import com.del.ies.admin.service.AdminAccService;

@RestController
public class ViewAdminController {
	 private static final org.jboss.logging.Logger logger = LoggerFactory.logger(ViewAdminController.class);
	@Autowired
	private AdminAccService adService;
	
	@GetMapping("/roleAcc")
	  public String getAccByRole(@PathVariable("role") String role, Model model){    
		 // hyperlink
			List<AdminAcc> allAccts=adService.getAccByRole(role);
			model.addAttribute("accounts", allAccts);
			  return "viewAcc";
		 }
		
	
	
	@GetMapping("/edit")
	public String editAdminAcc(@RequestParam("id") Integer id, Model model) {
		logger.info("Controller editContact() called......................");
		AdminAcc adAcc=adService.getAccById(id);
		System.out.println("-------------Controller------editContact()--------------"+adAcc);
		model.addAttribute("account",adAcc);
		return "admin"; 
		}
	
	@GetMapping("/deleteAcc")
	public String deleteContacts(@RequestParam("id") Integer cid , Model model){ 
		adService.deleteById(cid);
		//attribute.addFlashAttribute("delmsg", "Account has been deleted successfully");
		model.addAttribute("delmsg", "Account has been deleted successfully");
		//return "redirect:/viewAcc";
		return "viewAccounts";
		}
	
    /* It displays object data into form for the given id.   
     * The @PathVariable puts URL data into variable.*/  
	
   
}

