package com.wellsfargo.batch7.bms.dao;

import java.util.List;

import com.wellsfargo.batch7.bms.dto.IBSRegistration;
import com.wellsfargo.batch7.bms.exception.LibraryException;

public interface IIBSRegistration {

	IBSRegistration create(IBSRegistration IBSRegistration) throws LibraryException;
	IBSRegistration submit(IBSRegistration IBSRegistration) throws LibraryException;
	IBSRegistration getByRegId(int IBSRegistration) throws LibraryException;
	IBSRegistration verifyRegistration(int IBSRegistration) throws LibraryException;
	List<IBSRegistration> getAllusersReg() throws LibraryException;
}
