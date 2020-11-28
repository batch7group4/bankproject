package ibs.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
public class LoginDetailsEntity{
	
	@Id
	@Column(name="PWD_SEQ_ID")
	@GeneratedValue
	private Integer pwdSeqId;
	
	@Column(name="LOGIN_ID")
	private Integer loginid;
	
	@Column(name="LOGIN_PWD")
	private String loginPwd; 
	
	@OneToOne
	@JoinColumn(name="uci")
	private CustAcctEntity  loginAcct;

	@Column(name="SECURITY_QUEST")
	private String securityQues;
	
	@Column(name="SECURITY_ANS")
	private String securityAns;
	
	@Column(name="LCK_IND")
	private String lckInd;

	public LoginDetailsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginDetailsEntity(Integer pwdSeqId, Integer loginid, String loginPwd, CustAcctEntity loginAcct, String securityQues,
			String securityAns, String lckInd) {
		super();
		this.pwdSeqId = pwdSeqId;
		this.loginid = loginid;
		this.loginPwd = loginPwd;
		this.loginAcct = loginAcct;
		this.securityQues = securityQues;
		this.securityAns = securityAns;
		this.lckInd = lckInd;
	}

	public Integer getPwdSeqId() {
		return pwdSeqId;
	}

	public void setPwdSeqId(Integer pwdSeqId) {
		this.pwdSeqId = pwdSeqId;
	}

	public Integer getLoginid() {
		return loginid;
	}

	public void setLoginid(Integer loginid) {
		this.loginid = loginid;
	}

	public String getLoginPwd() {
		return loginPwd;
	}

	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}

	public CustAcctEntity getLoginAcct() {
		return loginAcct;
	}

	public void setLoginAcct(CustAcctEntity loginAcct) {
		this.loginAcct = loginAcct;
	}

	public String getSecurityQues() {
		return securityQues;
	}

	public void setSecurityQues(String securityQues) {
		this.securityQues = securityQues;
	}

	public String getSecurityAns() {
		return securityAns;
	}

	public void setSecurityAns(String securityAns) {
		this.securityAns = securityAns;
	}

	public String getLckInd() {
		return lckInd;
	}

	public void setLckInd(String lckInd) {
		this.lckInd = lckInd;
	}

		
}
