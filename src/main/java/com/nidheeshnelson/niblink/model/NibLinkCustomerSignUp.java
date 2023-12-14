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
	public int getId() {
		return id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPasswordc() {
		return passwordc;
	}
	public void setPasswordc(String passwordc) {
		this.passwordc = passwordc;
	}
	@Override
	public String toString() {
		return "NibLinkCustomerSignUp [id=" + id + ", email=" + email + ", phone=" + phone + ", user=" + user
				+ ", password=" + password + ", passwordc=" + passwordc + "]";
	}
}
