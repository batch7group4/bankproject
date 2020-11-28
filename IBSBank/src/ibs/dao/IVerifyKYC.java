package ibs.dao;

import ibs.controller.Registration;
import ibs.entities.CustAcctEntity;
import ibs.entities.ServiceProviderEntity;

public interface IVerifyKYC {

	Registration validateKYC(Registration regAcct); // Approve/reject registration & send mail accordingly
	CustAcctEntity createCustomerId(CustAcctEntity custAcct);
	ServiceProviderEntity createServiceProviderId(ServiceProviderEntity svcAcct);
	

}
