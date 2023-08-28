package com.login.login.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.login.dao.LoginDaoLayer;
import com.login.login.entity.LoginInfo;
import com.login.login.loginService.LoginInterface;

@Service
public class LoginserviceImpl  implements LoginInterface{
	@Autowired
	private LoginDaoLayer LoginDao;
	
	@Override
	public String NewUser(LoginInfo l) {
		LoginDao.save(l);
		return "New data entered";
		}

	@Override
	public Boolean verifyLogin(LoginInfo l) {
		
		String localUsername=l.getUsername();
		String localPasswordString=l.getPassword();
		LoginInfo databaseinfo=LoginDao.findById(localUsername).get();
		if(databaseinfo.getPassword().equals(localPasswordString))
		{return true;}
		else {return false;}
	}
		
	

}
