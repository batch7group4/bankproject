package ibs.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="CUST_BNFCRY")
public class BenficiaryEntity {
	
	
	@Id
	@Column(name="BNFCRY_ID")
	@GeneratedValue
	private Integer benficiaryId;
	
	@Column(name="BNFCRY_ACCT_NM")
	private String benficiaryName;
	
	@OneToMany(mappedBy="custAcctNum",cascade=CascadeType.ALL)
	@Column(name="BNFCRY_ACCT_NUM")
	private CustAcctEntity benficiaryAccountNumber;
	
	@Column(name="BNFCRY_TYP")
	private String benficiaryAccountType;
	
	@Column(name="BNFCRY_ACCT_BNK")
	private String benficiaryBank;
	
	@Column(name="BNFCRY_ACCT_IFSC")
	private String benficiaryIfsc;
	
	@Column(name="BNFCRY_MBL_NUM")
	private String bnfcryMblNum;
	
	public BenficiaryEntity() {
		super();
	}

	public BenficiaryEntity(Integer benficiaryId, String benficiaryName, CustAcctEntity benficiaryAccountNumber,
			String benficiaryAccountType, String benficiaryBank, String benficiaryIfsc) {
		super();
		this.benficiaryId = benficiaryId;
		this.benficiaryName = benficiaryName;
		this.benficiaryAccountNumber = benficiaryAccountNumber;
		this.benficiaryAccountType = benficiaryAccountType;
		this.benficiaryBank = benficiaryBank;
		this.benficiaryIfsc = benficiaryIfsc;
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

	public CustAcctEntity getBenficiaryAccountNumber() {
		return benficiaryAccountNumber;
	}

	public void setBenficiaryAccountNumber(CustAcctEntity benficiaryAccountNumber) {
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
	
		
	
}
