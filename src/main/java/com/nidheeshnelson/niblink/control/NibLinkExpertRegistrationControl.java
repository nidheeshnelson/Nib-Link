package com.nidheeshnelson.niblink.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nidheeshnelson.niblink.model.NibLinkExpertRegistration;
import com.nidheeshnelson.niblink.service.NibLinkExpertRegistrationService;

@Controller
public class NibLinkExpertRegistrationControl {
	@Autowired
	private NibLinkExpertRegistrationService regser;
@GetMapping("/expert")
String register(Model m) {
	System.out.println("in registration");
	m.addAttribute("forreg",new NibLinkExpertRegistration());
	return "registration";
}
@PostMapping("/register")
String getReg(@ModelAttribute NibLinkExpertRegistration expreg) {
	System.out.println("in register");
	regser.saveReg(expreg);
	return "home";
}
}
