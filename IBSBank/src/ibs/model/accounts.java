package ibs.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class accounts {

	private Integer accountNumber;
	private String accountType;
	private String accountStatus;
	private LocalDate accountStartDate;
	private String balance;
	private String transPassword;
	private String transAmount;
	private String transType;
	private LocalDateTime transStartTime;
	private LocalDateTime transEndTime;
	private Integer transFrom;
	private Integer transTo;
	private String transComments;
	
	public accounts() {
		super();
	}

	public accounts(Integer accountNumber, String accountType, String accountStatus, LocalDate accountStartDate,
			String balance, String transPassword, String transAmount, String transType, LocalDateTime transStartTime,
			LocalDateTime transEndTime, Integer transFrom, Integer transTo, String transComments) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.accountStatus = accountStatus;
		this.accountStartDate = accountStartDate;
		this.balance = balance;
		this.transPassword = transPassword;
		this.transAmount = transAmount;
		this.transType = transType;
		this.transStartTime = transStartTime;
		this.transEndTime = transEndTime;
		this.transFrom = transFrom;
		this.transTo = transTo;
		this.transComments = transComments;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public LocalDate getAccountStartDate() {
		return accountStartDate;
	}

	public void setAccountStartDate(LocalDate accountStartDate) {
		this.accountStartDate = accountStartDate;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	public String getTransPassword() {
		return transPassword;
	}

	public void setTransPassword(String transPassword) {
		this.transPassword = transPassword;
	}

	public String getTransAmount() {
		return transAmount;
	}

	public void setTransAmount(String transAmount) {
		this.transAmount = transAmount;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public LocalDateTime getTransStartTime() {
		return transStartTime;
	}

	public void setTransStartTime(LocalDateTime transStartTime) {
		this.transStartTime = transStartTime;
	}

	public LocalDateTime getTransEndTime() {
		return transEndTime;
	}

	public void setTransEndTime(LocalDateTime transEndTime) {
		this.transEndTime = transEndTime;
	}

	public Integer getTransFrom() {
		return transFrom;
	}

	public void setTransFrom(Integer transFrom) {
		this.transFrom = transFrom;
	}

	public Integer getTransTo() {
		return transTo;
	}

	public void setTransTo(Integer transTo) {
		this.transTo = transTo;
	}

	public String getTransComments() {
		return transComments;
	}

	public void setTransComments(String transComments) {
		this.transComments = transComments;
	}
	
	
}
