package com.nidheeshnelson.niblink.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="login")
public class NibLinkLogin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
	@OneToOne
	private NibLinkExpertRegistration expertid;
	@OneToOne
	private NibLinkCustomerSignUp customerid;
	@OneToOne
	private NibLinkAdmin adminid;
	private String user;
	private String password;
}
