package com.nidheeshnelson.niblink.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidheeshnelson.niblink.repository.NibLinkAdminRepo;

@Service
public class NibLinkAdminService {
	@Autowired
private NibLinkAdminRepo ar;
	
}
