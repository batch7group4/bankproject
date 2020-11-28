package ibs.dao;

import ibs.entities.BenficiaryEntity;
import ibs.entities.CustAcctEntity;
import ibs.entities.LoginDetailsEntity;
import ibs.entities.ServiceProviderEntity;
import ibs.entities.AcctTransactionEntity;

public interface IUserDao {

	LoginDetailsEntity custLogin(LoginDetailsEntity custAcct);
	
	CustAcctEntity checkBalance(CustAcctEntity custAcct);
	
	BenficiaryEntity addBeneficiary(BenficiaryEntity custAcct);
	BenficiaryEntity updateBeneficiary(BenficiaryEntity custAcct);
	
	AcctTransactionEntity transferFunds(AcctTransactionEntity custAcct);
	AcctTransactionEntity viewStatement(AcctTransactionEntity custAcct);
	
	ServiceProviderEntity payUtilBills(ServiceProviderEntity custAcct);
	
	
}
