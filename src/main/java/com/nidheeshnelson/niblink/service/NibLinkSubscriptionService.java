package com.nidheeshnelson.niblink.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nidheeshnelson.niblink.model.NibLinkSubscription;
import com.nidheeshnelson.niblink.repository.NibLinkSubscriptionRepo;

@Service
public class NibLinkSubscriptionService {
	@Autowired
private NibLinkSubscriptionRepo subrep;
	public void savesub(NibLinkSubscription sub) {
		subrep.save(sub);
	}
}
