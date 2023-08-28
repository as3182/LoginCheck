package com.login.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.login.login.entity.LoginInfo;
import com.login.login.loginService.LoginInterface;

@RestController
public class LoginController {
	
	
	@Autowired
	private LoginInterface loginInterface;
	
	@PostMapping("/signup")
	public String SignUp(@RequestBody LoginInfo l )
	{
		return this.loginInterface.NewUser(l);
	}
	
	@GetMapping("/signin")
	public Boolean SignIn(@RequestBody LoginInfo l)
	{
		return this.loginInterface.verifyLogin(l);
	}
	

}
