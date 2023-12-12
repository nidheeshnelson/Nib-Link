package com.nidheeshnelson.niblink.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nidheeshnelson.niblink.model.NibLinkLogin;

@Repository
public interface NibLinkLoginRepo extends JpaRepository<NibLinkLogin, Integer> {

}
