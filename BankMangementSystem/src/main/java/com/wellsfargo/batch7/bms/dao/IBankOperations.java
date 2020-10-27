package com.wellsfargo.batch7.bms.dao;

import com.wellsfargo.batch7.bms.dto.BankOperations;
import com.wellsfargo.batch7.bms.exception.LibraryException;

public interface IBankOperations {

	BankOperations addLoanTypes(BankOperations BankOperations) throws LibraryException;
	BankOperations addIntrestRates(BankOperations BankOperations) throws LibraryException;
	BankOperations verifyLoanRequest(BankOperations BankOperations) throws LibraryException;
	BankOperations generateStatements(int uci) throws LibraryException;
	BankOperations verifyLoanPreClouser(BankOperations BankOperations) throws LibraryException;
	BankOperations verifyCardRequest(BankOperations BankOperations) throws LibraryException;
	BankOperations deactivateCard(BankOperations BankOperations) throws LibraryException;
	BankOperations handleCardServiceRequest(BankOperations BankOperations) throws LibraryException;
	
}
