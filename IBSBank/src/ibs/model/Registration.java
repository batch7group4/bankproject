package ibs.model;

import java.time.LocalDate;

public class Registration {
	private Integer registerationId;
	private String fullName;
	private LocalDate dateofBirth;
	private String gender;
	private String email_id;
	private Integer mobileNumber;
	private String address;
	private String city;
	private String pinCode;
	private String roleName;
	private String serviceProvider;
	private String accountType;
	private String kycDoc;
	
	
	public Registration() {
		super();
	}


	public Registration(Integer registerationId, String fullName, LocalDate dateofBirth, String gender, String email_id,
			Integer mobileNumber, String address, String city, String pinCode, String roleName, String serviceProvider,
			String accountType, String kycDoc) {
		super();
		this.registerationId = registerationId;
		this.fullName = fullName;
		this.dateofBirth = dateofBirth;
		this.gender = gender;
		this.email_id = email_id;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.city = city;
		this.pinCode = pinCode;
		this.roleName = roleName;
		this.serviceProvider = serviceProvider;
		this.accountType = accountType;
		this.kycDoc = kycDoc;
	}


	public Integer getRegisterationId() {
		return registerationId;
	}


	public void setRegisterationId(Integer registerationId) {
		this.registerationId = registerationId;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public LocalDate getDateofBirth() {
		return dateofBirth;
	}


	public void setDateofBirth(LocalDate dateofBirth) {
		this.dateofBirth = dateofBirth;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getEmail_id() {
		return email_id;
	}


	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}


	public Integer getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(Integer mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getPinCode() {
		return pinCode;
	}


	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}


	public String getRoleName() {
		return roleName;
	}


	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


	public String getServiceProvider() {
		return serviceProvider;
	}


	public void setServiceProvider(String serviceProvider) {
		this.serviceProvider = serviceProvider;
	}


	public String getAccountType() {
		return accountType;
	}


	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


	public String getKycDoc() {
		return kycDoc;
	}


	public void setKycDoc(String kycDoc) {
		this.kycDoc = kycDoc;
	}
	
	
	
}
