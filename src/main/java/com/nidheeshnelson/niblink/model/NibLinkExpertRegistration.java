package com.nidheeshnelson.niblink.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="expert_registration")
public class NibLinkExpertRegistration {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
@Column(name="name")
private String name;
private String dob;
private String email;
private int phone;
private String gender;
private String education;
private int adhar;
private String pan;
private String dl;
private String user;
private String pass;
private String passc;
private String addresstype;
private String place;
private String state;
private String district;
private String thaluk;
private String local;
private String father;
private String mother;
private String merital;
private String spouse;
private int children;
private String religion;
private String mode;
private String field;
private int pin;
private String distance;
private int payment;
private double commission;
private String bank;
private String branch;
private String ifsc;
private String account;
private String accountc;
private String secret;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
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
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getEducation() {
	return education;
}
public void setEducation(String education) {
	this.education = education;
}
public int getAdhar() {
	return adhar;
}
public void setAdhar(int adhar) {
	this.adhar = adhar;
}
public String getPan() {
	return pan;
}
public void setPan(String pan) {
	this.pan = pan;
}
public String getDl() {
	return dl;
}
public void setDl(String dl) {
	this.dl = dl;
}
public String getUser() {
	return user;
}
public void setUser(String user) {
	this.user = user;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public String getPassc() {
	return passc;
}
public void setPassc(String passc) {
	this.passc = passc;
}
public String getAddresstype() {
	return addresstype;
}
public void setAddresstype(String addresstype) {
	this.addresstype = addresstype;
}
public String getPlace() {
	return place;
}
public void setPlace(String place) {
	this.place = place;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getDistrict() {
	return district;
}
public void setDistrict(String district) {
	this.district = district;
}
public String getThaluk() {
	return thaluk;
}
public void setThaluk(String thaluk) {
	this.thaluk = thaluk;
}
public String getLocal() {
	return local;
}
public void setLocal(String local) {
	this.local = local;
}
public String getFather() {
	return father;
}
public void setFather(String father) {
	this.father = father;
}
public String getMother() {
	return mother;
}
public void setMother(String mother) {
	this.mother = mother;
}
public String getMerital() {
	return merital;
}
public void setMerital(String merital) {
	this.merital = merital;
}
public String getSpouse() {
	return spouse;
}
public void setSpouse(String spouse) {
	this.spouse = spouse;
}
public int getChildren() {
	return children;
}
public void setChildren(int children) {
	this.children = children;
}
public String getReligion() {
	return religion;
}
public void setReligion(String religion) {
	this.religion = religion;
}
public String getMode() {
	return mode;
}
public void setMode(String mode) {
	this.mode = mode;
}
public String getField() {
	return field;
}
public void setField(String field) {
	this.field = field;
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
public String getDistance() {
	return distance;
}
public void setDistance(String distance) {
	this.distance = distance;
}
public int getPayment() {
	return payment;
}
public void setPayment(int payment) {
	this.payment = payment;
}
public double getCommission() {
	return commission;
}
public void setCommission(double commission) {
	this.commission = commission;
}
public String getBank() {
	return bank;
}
public void setBank(String bank) {
	this.bank = bank;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public String getIfsc() {
	return ifsc;
}
public void setIfsc(String ifsc) {
	this.ifsc = ifsc;
}
public String getAccount() {
	return account;
}
public void setAccount(String account) {
	this.account = account;
}
public String getAccountc() {
	return accountc;
}
public void setAccountc(String accountc) {
	this.accountc = accountc;
}
public String getSecret() {
	return secret;
}
public void setSecret(String secret) {
	this.secret = secret;
}
}
