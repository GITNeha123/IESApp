package com.del.ies.dc.Controller;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.del.ies.admin.controller.AdminAccController;
import com.del.ies.admin.domain.AdminAcc;
import com.del.ies.admin.service.AdminAccService;

@Controller
public class SearchController {
	 private static final org.jboss.logging.Logger logger = LoggerFactory.logger(SearchController.class);
		@Autowired
		private AdminAccService adService;
		
		@GetMapping(value="/dc")
		 public String loadForm(Model model) {
			 return "searchCC";
		 } // to display form

	

}
