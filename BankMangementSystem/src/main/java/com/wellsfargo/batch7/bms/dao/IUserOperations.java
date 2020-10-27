package com.wellsfargo.batch7.bms.dao;

import com.wellsfargo.batch7.bms.dto.UserOperations;
import com.wellsfargo.batch7.bms.exception.LibraryException;

public interface IUserOperations {
	
	
	UserOperations deposit(UserOperations UserOperations) throws LibraryException;
	UserOperations withdrawl(UserOperations UserOperations) throws LibraryException;
	UserOperations transfer(UserOperations UserOperations) throws LibraryException;
	UserOperations balancecheck(UserOperations UserOperations) throws LibraryException;
	UserOperations requestForMiniStatement(UserOperations UserOperations) throws LibraryException;
	UserOperations applyloan(UserOperations UserOperations) throws LibraryException;
	UserOperations loanPreClouser(UserOperations UserOperations) throws LibraryException;
	UserOperations applyForCards(UserOperations UserOperations) throws LibraryException;
	UserOperations payments(UserOperations UserOperations) throws LibraryException;
	UserOperations createServiceRequest(UserOperations UserOperations) throws LibraryException;
	
}
