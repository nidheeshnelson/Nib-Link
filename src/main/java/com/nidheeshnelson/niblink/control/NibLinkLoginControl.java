package com.nidheeshnelson.niblink.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nidheeshnelson.niblink.model.NibLinkCustomerSignUp;
import com.nidheeshnelson.niblink.model.NibLinkLogin;
import com.nidheeshnelson.niblink.service.NibLinkLoginService;

@Controller
public class NibLinkLoginControl {
	@Autowired
private NibLinkLoginService ls;
	@GetMapping("/log")
	String logIn(Model m) {
		System.out.println("in login");
		m.addAttribute("loging", new NibLinkLogin());
		m.addAttribute("sign", new NibLinkCustomerSignUp());
		return "signup";
	}
	@PostMapping("/logaccount")
	String accoount(@ModelAttribute("loging") NibLinkLogin lo) {
		System.out.println("in Login account");
		
		return "";
	}
}
