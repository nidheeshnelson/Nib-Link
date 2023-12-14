package com.nidheeshnelson.niblink.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nidheeshnelson.niblink.model.NibLinkCustomerSignUp;
import com.nidheeshnelson.niblink.model.NibLinkLogin;
import com.nidheeshnelson.niblink.service.NibLinkCustomerSignUpService;
import com.nidheeshnelson.niblink.service.NibLinkLoginService;

@Controller
public class NibLinkCustomerSignUpControl {
	@Autowired
private NibLinkCustomerSignUpService sus;
	@Autowired
	private NibLinkLoginService los;
	@PostMapping("/customer")
	String signUp(@ModelAttribute("sign")NibLinkCustomerSignUp csu, Model m) {
//		Registering customer in customer table
		System.out.println("In sign up");
		NibLinkCustomerSignUp csup= sus.signUp(csu);
		System.out.println(csup);
		
//		Registering customer in Login Table
		NibLinkLogin lo = new NibLinkLogin();
		lo.setCustomerid(csup.getId());
		m.addAttribute("id", csup.getId());
		lo.setUser(csup.getUser());
		lo.setPassword(csup.getPassword());
		los.log(lo);
		return "popupsignup";
	}
}
