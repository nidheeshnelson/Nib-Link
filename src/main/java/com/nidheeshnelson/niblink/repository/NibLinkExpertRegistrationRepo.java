package com.nidheeshnelson.niblink.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblink.model.NibLinkExpertRegistration;

@Repository
public interface NibLinkExpertRegistrationRepo extends JpaRepository<NibLinkExpertRegistration, Integer> {

}
