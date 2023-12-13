package com.nidheeshnelson.niblink.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nidheeshnelson.niblink.service.NibLinkAdminService;

@Controller
public class NibLinkAdminControl {
	@Autowired
private NibLinkAdminService as;
}
