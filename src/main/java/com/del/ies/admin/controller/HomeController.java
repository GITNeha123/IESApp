package com.del.ies.admin.controller;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
private static final org.jboss.logging.Logger logger = LoggerFactory.logger(HomeController.class);
		@Autowired
		//private UserService service;
	
	@GetMapping(value= {"/","/home"})
	public String loadHomeFrm() {

		return "home";
		}


}
