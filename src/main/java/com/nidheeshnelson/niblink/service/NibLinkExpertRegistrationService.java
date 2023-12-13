package com.nidheeshnelson.niblink.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidheeshnelson.niblink.model.NibLinkExpertRegistration;
import com.nidheeshnelson.niblink.repository.NibLinkExpertRegistrationRepo;

@Service
public class NibLinkExpertRegistrationService {
	@Autowired
private NibLinkExpertRegistrationRepo reg;
public NibLinkExpertRegistration saveReg(NibLinkExpertRegistration exreg) {
	return reg.save(exreg);
	
}
}
