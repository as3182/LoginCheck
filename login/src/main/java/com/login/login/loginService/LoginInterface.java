package com.login.login.loginService;

import com.login.login.entity.LoginInfo;

public interface LoginInterface {

	public String NewUser(LoginInfo l);
	public Boolean verifyLogin(LoginInfo l);
	
}
