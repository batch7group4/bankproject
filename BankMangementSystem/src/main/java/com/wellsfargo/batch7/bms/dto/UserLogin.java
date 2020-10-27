package com.wellsfargo.batch7.bms.dto;

public class UserLogin {

	private Integer uci;
	private String password;
	private String resetPassword;
	private String securityQuestion;
	private String securityAnswer;
	
	public UserLogin(Integer uci, String password) {
		super();
		this.uci = uci;
		this.password = password;
		this.resetPassword = resetPassword;
		this.securityQuestion = securityQuestion;
		this.securityAnswer = securityAnswer;
	}

	public Integer getUci() {
		return uci;
	}

	public void setUci(Integer uci) {
		this.uci = uci;
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
