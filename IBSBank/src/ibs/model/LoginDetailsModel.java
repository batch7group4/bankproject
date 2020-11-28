package ibs.model;

public class LoginDetailsModel{
	

	private Integer pwdSeqId;
	private Integer loginid;
	private String loginPwd; 
	private Integer  loginAcct;
    private String securityQues;
	private String securityAns;
	private String lckInd;

	public LoginDetailsModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginDetailsModel(Integer pwdSeqId, Integer loginid, String loginPwd, Integer loginAcct, String securityQues,
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

	public Integer getLoginAcct() {
		return loginAcct;
	}

	public void setLoginAcct(Integer loginAcct) {
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
