package com.nidheeshnelson.niblink.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidheeshnelson.niblink.model.NibLinkCustomerSignUp;
import com.nidheeshnelson.niblink.repository.NibLinkCustomerSignUpRepo;

@Service
public class NibLinkCustomerSignUpService {
	@Autowired
private NibLinkCustomerSignUpRepo csur;
	public void signUp(NibLinkCustomerSignUp su) {
		csur.save(su);
	}
}
