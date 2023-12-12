package com.nidheeshnelson.niblink.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nidheeshnelson.niblink.model.NibLinkSubscription;
import com.nidheeshnelson.niblink.service.NibLinkSubscriptionService;

@Controller
public class NibLinkControl {
	@Autowired
	private NibLinkSubscriptionService ss;
@GetMapping("/")
String connect() {
	System.out.println("In Connection");
	
	return "home";
}
@PostMapping("/subscribe")
String sub(@RequestParam("email") String su) {
	System.out.println("email : "+su);
	NibLinkSubscription nib = new NibLinkSubscription();
	nib.setEmail(su);
	ss.savesub(nib);
	return "home";
}
}