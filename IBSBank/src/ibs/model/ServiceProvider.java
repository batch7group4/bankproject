package ibs.model;

public class ServiceProvider {

	private Integer serviceProviderId;
	private Integer serviceProviderAccountNumber;
	private String serviceProviderName;
	private String serviceProviderBank;
	private String serviceProviderBranch;
	
	public ServiceProvider() {
		super();
	}

	public ServiceProvider(Integer serviceProviderId, Integer serviceProviderAccountNumber, String serviceProviderName,
			String serviceProviderBank, String serviceProviderBranch) {
		super();
		this.serviceProviderId = serviceProviderId;
		this.serviceProviderAccountNumber = serviceProviderAccountNumber;
		this.serviceProviderName = serviceProviderName;
		this.serviceProviderBank = serviceProviderBank;
		this.serviceProviderBranch = serviceProviderBranch;
	}

	public Integer getServiceProviderId() {
		return serviceProviderId;
	}

	public void setServiceProviderId(Integer serviceProviderId) {
		this.serviceProviderId = serviceProviderId;
	}

	public Integer getServiceProviderAccountNumber() {
		return serviceProviderAccountNumber;
	}

	public void setServiceProviderAccountNumber(Integer serviceProviderAccountNumber) {
		this.serviceProviderAccountNumber = serviceProviderAccountNumber;
	}

	public String getServiceProviderName() {
		return serviceProviderName;
	}

	public void setServiceProviderName(String serviceProviderName) {
		this.serviceProviderName = serviceProviderName;
	}

	public String getServiceProviderBank() {
		return serviceProviderBank;
	}

	public void setServiceProviderBank(String serviceProviderBank) {
		this.serviceProviderBank = serviceProviderBank;
	}

	public String getServiceProviderBranch() {
		return serviceProviderBranch;
	}

	public void setServiceProviderBranch(String serviceProviderBranch) {
		this.serviceProviderBranch = serviceProviderBranch;
	}
	
	
	
}
