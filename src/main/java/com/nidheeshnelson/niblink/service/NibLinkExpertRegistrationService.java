package com.nidheeshnelson.niblink.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidheeshnelson.niblink.model.NibLinkExpertRegistration;
import com.nidheeshnelson.niblink.repository.NibLinkExpertRegistrationRepo;

@Service
public class NibLinkExpertRegistrationService {
	@Autowired
private NibLinkExpertRegistrationRepo reg;
public void saveReg(NibLinkExpertRegistration exreg) {
	reg.save(exreg);
}
}
