package com.del.ies.dc.Controller;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.del.ies.ar.domain.Registration;
import com.del.ies.dc.domain.CreateCase;
import com.del.ies.dc.domain.CreatePlan;
import com.del.ies.dc.service.CCService;

@Controller
public class CreatePlanController {
	private static final org.jboss.logging.Logger logger = LoggerFactory.logger(CreatePlanController.class);

	@Autowired
	private CCService ccService;

	@GetMapping(value = "/cratePlan")
	public String loadForm(Model model) {
		CreatePlan cp = new CreatePlan();
		cp.setcID(100001);
		cp.setFname("Neha");
		cp.setLname("Sahu");

		model.addAttribute("cPln", cp);
		
		return "cratePlan";
	} // to display form

	@PostMapping("/svePln")
	public String handleCreatePlnBtn(@ModelAttribute("cPln") CreatePlan c, RedirectAttributes model, Model m) { // form
																												// submission
		logger.info("====Controller=============CreatePlnBtn is saving =================@@");
		System.out.println("before save in Controller==============================" + c);
		String res = "";
		boolean isSaved = ccService.savePlnDtls(c);
		System.out.println("after CreatePlnBtn in Controller===================");
		if (isSaved) {
			if (c.getcID() != null) {
				System.out.println("======================c.getcID()================"+c.getcID());
				//CreateCase cc=	ccService.getDataByCid(c.getcID());
				

				model.addFlashAttribute("susmsg", "Case has Updated succefully...");

			} else {
				model.addFlashAttribute("susmsg", "Case has Saved succefully...");
				logger.info("=============PlnBtn is saved successfully=================@@");
			}
		} else
			model.addFlashAttribute("errmsg", "Case did not Saved...");
		// return "index";
		return "redirect:incmePln";
	}

}
