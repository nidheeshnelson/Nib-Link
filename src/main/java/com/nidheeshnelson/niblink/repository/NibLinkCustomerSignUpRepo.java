package com.nidheeshnelson.niblink.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblink.model.NibLinkCustomerSignUp;

@Repository
public interface NibLinkCustomerSignUpRepo extends JpaRepository<NibLinkCustomerSignUp, Integer> {

}
