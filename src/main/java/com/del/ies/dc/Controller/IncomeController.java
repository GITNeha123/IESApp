package com.del.ies.dc.Controller;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.del.ies.dc.domain.CreatePlan;
import com.del.ies.dc.domain.IncomePln;
import com.del.ies.dc.service.CCService;

@Controller
public class IncomeController {
	private static final org.jboss.logging.Logger logger = LoggerFactory.logger(IncomeController.class);

	@Autowired
	private CCService ccService;

	@GetMapping(value = "/incmePln")
	public String loadForm(Model model) {
		System.out.println("=================IncomePln Controller================================");
		IncomePln ip = new IncomePln();
		ip.setcID(100001);
		ip.setName("Neha Sahu");
		model.addAttribute("incm", ip);
		return "incmePln";
	} // to display form

	@PostMapping("/sveInme")
	public String handleIncmeBtn(@ModelAttribute("incm") IncomePln ip, RedirectAttributes model, Model m) { // form
																											// submission
		logger.info("====Controller=============handleIncmeBtn is saving =================@@");
		System.out.println("before save in Controller==============================" + ip);
		boolean isSaved = ccService.saveincmeDtls(ip);
		System.out.println("after CreatePlnBtn in Controller===================");
		if (isSaved) {
			if (ip.getcID() != null) {
				System.out.println("======================IncmeBtn.getcID()================" + ip.getcID());
				model.addFlashAttribute("susmsg", "Income has Saved succefully...");

			} else {
				model.addFlashAttribute("susmsg", "Case has Updated succefully...");
				logger.info("=============IncmeBtn is saved successfully=================@@");
			}
		} else
			model.addFlashAttribute("errmsg", "Case did not Saved...");
		return "redirect:incmePln";
	}
}
