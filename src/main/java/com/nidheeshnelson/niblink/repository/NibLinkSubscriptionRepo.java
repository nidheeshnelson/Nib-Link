package com.nidheeshnelson.niblink.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblink.model.NibLinkSubscription;
@Repository
public interface NibLinkSubscriptionRepo extends JpaRepository<NibLinkSubscription, Integer> {

}
