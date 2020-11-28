package ibs.dao;

import ibs.entities.AcctTransactionEntity;

public interface IAdminDao {
	
	AcctTransactionEntity chkCustStatement(AcctTransactionEntity custAcct) ;
	AcctTransactionEntity fundDepositEntry(AcctTransactionEntity custAcct) ;
	
	
}
