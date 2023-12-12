package com.nidheeshnelson.niblink.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
public class NibLinkCustomerSignUp {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
	private String email;
	private int phone;
	private String user;
	private String password;
	private String passwordc;
}
