package com.nidheeshnelson.niblink.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="login")
public class NibLinkLogin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
	
	private int expertid;
	
	private int customerid;
	
	private int adminid;
	private String user;
	private String password;
	public int getId() {
		return id;
	}
	public int getExpertid() {
		return expertid;
	}
	public void setExpertid(int expertid) {
		this.expertid = expertid;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public int getAdminid() {
		return adminid;
	}
	public void setAdminid(int adminid) {
		this.adminid = adminid;
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
	@Override
	public String toString() {
		return "NibLinkLogin [id=" + id + ", expertid=" + expertid + ", customerid=" + customerid + ", adminid="
				+ adminid + ", user=" + user + ", password=" + password + "]";
	}
}
