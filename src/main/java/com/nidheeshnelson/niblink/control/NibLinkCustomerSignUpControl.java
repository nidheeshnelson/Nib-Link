package com.nidheeshnelson.niblink.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nidheeshnelson.niblink.model.NibLinkCustomerSignUp;
import com.nidheeshnelson.niblink.service.NibLinkCustomerSignUpService;

@Controller
public class NibLinkCustomerSignUpControl {
	@Autowired
private NibLinkCustomerSignUpService sus;
	@PostMapping("/customer")
	String signUp(@ModelAttribute("sign")NibLinkCustomerSignUp csu) {
		System.out.println("In sign up");
		sus.signUp(csu);
		return "signup";
	}
}
