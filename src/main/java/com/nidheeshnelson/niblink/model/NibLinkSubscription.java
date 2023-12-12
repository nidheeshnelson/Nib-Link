package com.nidheeshnelson.niblink.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="subscription")
public class NibLinkSubscription {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
@Column(name="email_id")
private String email;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
}
