package com.nidheeshnelson.niblink.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nidheeshnelson.niblink.model.NibLinkExpertRegistration;
import com.nidheeshnelson.niblink.model.NibLinkLogin;
import com.nidheeshnelson.niblink.service.NibLinkExpertRegistrationService;
import com.nidheeshnelson.niblink.service.NibLinkLoginService;

@Controller
public class NibLinkExpertRegistrationControl {
	@Autowired
	private NibLinkExpertRegistrationService regser;
	@Autowired
	private NibLinkLoginService ls;
@GetMapping("/expert")
String register(Model m) {
	System.out.println("in registration");
	m.addAttribute("forreg",new NibLinkExpertRegistration());
	return "registration";
}
@PostMapping("/register")
String getReg(@ModelAttribute("forreg") NibLinkExpertRegistration expreg, Model m) {
//	Registering into expert table
	System.out.println("in register");
	NibLinkExpertRegistration epg = regser.saveReg(expreg);
	System.out.println(epg);
	
//	Expert Registering into Login Table
	NibLinkLogin lo = new NibLinkLogin();
	lo.setExpertid(epg.getId());
	m.addAttribute("id", epg.getId());
	lo.setUser(epg.getUser());
	lo.setPassword(epg.getPass());
	System.out.println(ls.log(lo));
	return "popupregister";
}
}
