package com.wellsfargo.batch7.bms.dto;

import java.time.LocalDate;

public class IBSRegistration {
	private Integer registeration_Id;
	private String fName;
	private String LName;
	private String address;
	private String state;
	private String country;
	private String zip;
	private LocalDate dateofBirth;
	private String mobile;
	private String email;
	private Integer role_id;
	private String role_name;
	private String accountType;
	//private String Branch_Name;
	private Character upload_ind;
	private String kyc_proofType;
	
	
	public IBSRegistration(Integer registeration_Id, String fName, String lName, String address, String state,
			String country, String zip, LocalDate dateofBirth, String mobile, String email, String role_name,
			String accountType) {
		super();
		this.registeration_Id = registeration_Id;
		this.fName = fName;
		LName = lName;
		this.address = address;
		this.state = state;
		this.country = country;
		this.zip = zip;
		this.dateofBirth = dateofBirth;
		this.mobile = mobile;
		this.email = email;
		this.role_name = role_name;
		this.accountType = accountType;
		this.role_id=role_id;
		this.upload_ind = upload_ind;
		this.kyc_proofType = kyc_proofType;
	}


	public Integer getRegisteration_Id() {
		return registeration_Id;
	}


	public void setRegisteration_Id(Integer registeration_Id) {
		this.registeration_Id = registeration_Id;
	}


	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public String getLName() {
		return LName;
	}


	public void setLName(String lName) {
		LName = lName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getZip() {
		return zip;
	}


	public void setZip(String zip) {
		this.zip = zip;
	}


	public LocalDate getDateofBirth() {
		return dateofBirth;
	}


	public void setDateofBirth(LocalDate dateofBirth) {
		this.dateofBirth = dateofBirth;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getRole_name() {
		return role_name;
	}


	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}


	public String getAccountType() {
		return accountType;
	}


	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


	public Character getUpload_ind() {
		return upload_ind;
	}


	public void setUpload_ind(Character upload_ind) {
		this.upload_ind = upload_ind;
	}


	public String getKyc_proofType() {
		return kyc_proofType;
	}


	public void setKyc_proofType(String kyc_proofType) {
		this.kyc_proofType = kyc_proofType;
	}
	
	
	
	
	
	
}
