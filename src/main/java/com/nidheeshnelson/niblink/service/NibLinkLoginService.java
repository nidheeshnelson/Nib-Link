package com.nidheeshnelson.niblink.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidheeshnelson.niblink.repository.NibLinkLoginRepo;

@Service
public class NibLinkLoginService {
	@Autowired
private NibLinkLoginRepo lr;
	
}
