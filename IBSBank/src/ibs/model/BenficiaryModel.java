package ibs.model;

public class BenficiaryModel {
	
	

	private Integer benficiaryId;
	private String benficiaryName;
	private Integer benficiaryAccountNumber;
	private String benficiaryAccountType;
	private String benficiaryBank;
	private String benficiaryIfsc;
	private String bnfcryMblNum;
	
	public BenficiaryModel() {
		super();
	}

	public BenficiaryModel(Integer benficiaryId, String benficiaryName, Integer benficiaryAccountNumber,
			String benficiaryAccountType, String benficiaryBank, String benficiaryIfsc, String bnfcryMblNum) {
		super();
		this.benficiaryId = benficiaryId;
		this.benficiaryName = benficiaryName;
		this.benficiaryAccountNumber = benficiaryAccountNumber;
		this.benficiaryAccountType = benficiaryAccountType;
		this.benficiaryBank = benficiaryBank;
		this.benficiaryIfsc = benficiaryIfsc;
		this.bnfcryMblNum = bnfcryMblNum;
	}

	public Integer getBenficiaryId() {
		return benficiaryId;
	}

	public void setBenficiaryId(Integer benficiaryId) {
		this.benficiaryId = benficiaryId;
	}

	public String getBenficiaryName() {
		return benficiaryName;
	}

	public void setBenficiaryName(String benficiaryName) {
		this.benficiaryName = benficiaryName;
	}

	public Integer getBenficiaryAccountNumber() {
		return benficiaryAccountNumber;
	}

	public void setBenficiaryAccountNumber(Integer benficiaryAccountNumber) {
		this.benficiaryAccountNumber = benficiaryAccountNumber;
	}

	public String getBenficiaryAccountType() {
		return benficiaryAccountType;
	}

	public void setBenficiaryAccountType(String benficiaryAccountType) {
		this.benficiaryAccountType = benficiaryAccountType;
	}

	public String getBenficiaryBank() {
		return benficiaryBank;
	}

	public void setBenficiaryBank(String benficiaryBank) {
		this.benficiaryBank = benficiaryBank;
	}

	public String getBenficiaryIfsc() {
		return benficiaryIfsc;
	}

	public void setBenficiaryIfsc(String benficiaryIfsc) {
		this.benficiaryIfsc = benficiaryIfsc;
	}

	public String getBnfcryMblNum() {
		return bnfcryMblNum;
	}

	public void setBnfcryMblNum(String bnfcryMblNum) {
		this.bnfcryMblNum = bnfcryMblNum;
	}
}
