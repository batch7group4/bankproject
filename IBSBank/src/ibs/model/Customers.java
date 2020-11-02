package ibs.model;


public class Customers {

	private Integer customerId;
	private String customerName;
	private Integer accountNumber;
	private String password;
	private String resetPassword;
	private String securityQuestion;
	private String securityAnswer;
	
	public Customers() {
		super();
	}
	
	
	public Customers(Integer customerId, String customerName, Integer accountNumber, String password,
			String resetPassword, String securityQuestion, String securityAnswer) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.accountNumber = accountNumber;
		this.password = password;
		this.resetPassword = resetPassword;
		this.securityQuestion = securityQuestion;
		this.securityAnswer = securityAnswer;
	}



	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getResetPassword() {
		return resetPassword;
	}

	public void setResetPassword(String resetPassword) {
		this.resetPassword = resetPassword;
	}

	public String getSecurityQuestion() {
		return securityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public String getSecurityAnswer() {
		return securityAnswer;
	}

	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}
	
	
	
}
