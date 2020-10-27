package com.wellsfargo.batch7.bms.dto;

import java.time.LocalDate;

public class UserOperations {
	private Integer uci;
	private String accountType;
	private Integer accountNumber;
	private LocalDate startFromDate;
	private LocalDate startToDate;
	private Double balance;
	private Double amount;
	private Double loanAmount;
	private String loanType;
	private String serviceProviderId;
	private String cardType;
	private Integer cardNumber;
	private Integer serviceRequestNum;
	
		
	public UserOperations(Integer uci, String accountType, Integer accountNumber, LocalDate startFromDate,
			LocalDate startToDate, Double balance, Double amount, Double loanAmount, String loanType,
			String serviceProviderId, String cardType, Integer cardNumber,Integer serviceRequestNum) {
		super();
		this.uci = uci;
		this.accountType = accountType;
		this.accountNumber = accountNumber;
		this.startFromDate = startFromDate;
		this.startToDate = startToDate;
		this.balance = balance;
		this.amount = amount;
		this.loanAmount = loanAmount;
		this.loanType = loanType;
		this.serviceProviderId = serviceProviderId;
		this.cardType = cardType;
		this.cardNumber = cardNumber;
	}

	public Integer getUci() {
		return uci;
	}

	public void setUci(Integer uci) {
		this.uci = uci;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public LocalDate getStartFromDate() {
		return startFromDate;
	}

	public void setStartFromDate(LocalDate startFromDate) {
		this.startFromDate = startFromDate;
	}

	public LocalDate getStartToDate() {
		return startToDate;
	}

	public void setStartToDate(LocalDate startToDate) {
		this.startToDate = startToDate;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(Double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public String getServiceProviderId() {
		return serviceProviderId;
	}

	public void setServiceProviderId(String serviceProviderId) {
		this.serviceProviderId = serviceProviderId;
	}


	public String getCardType() {
		return cardType;
	}


	public void setCardType(String cardType) {
		this.cardType = cardType;
	}


	public Integer getCardNumber() {
		return cardNumber;
	}


	public void setCardNumber(Integer cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Integer getServiceRequestNum() {
		return serviceRequestNum;
	}

	public void setServiceRequestNum(Integer serviceRequestNum) {
		this.serviceRequestNum = serviceRequestNum;
	}
	
	
	
	
}
