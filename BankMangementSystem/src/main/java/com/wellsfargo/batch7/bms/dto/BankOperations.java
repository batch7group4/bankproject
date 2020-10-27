package com.wellsfargo.batch7.bms.dto;

import java.time.LocalDate;

public class BankOperations {
	
	private Integer uci;
	private Integer accountNumber;
	private LocalDate startFromDate;
	private LocalDate startToDate;
	private String loanType;
	private Double intrestRate;
	
	UserOperations UO;
	
	public BankOperations(Integer uci, Integer accountNumber, LocalDate startFromDate, LocalDate startToDate,
			String loanType, Double intrestRate) {
		super();
		this.uci = uci;
		this.accountNumber = accountNumber;
		this.startFromDate = startFromDate;
		this.startToDate = startToDate;
		this.loanType = loanType;
		this.intrestRate = intrestRate;
	}

	public Integer getUci() {
		return uci;
	}

	public void setUci(Integer uci) {
		this.uci = uci;
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

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public Double getIntrestRate() {
		return intrestRate;
	}

	public void setIntrestRate(Double intrestRate) {
		this.intrestRate = intrestRate;
	}
	

	
	
}