package com.login.login.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name="bankdatabase")
@Entity
public class LoginInfo {
	
	@Id
	private String username;
	private String password;
	private String name;
	
	public LoginInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginInfo(String username, String password, String name) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
	}
	@Override
	public String toString() {
		return "LoginInfo [username=" + username + ", password=" + password + ", Name=" + name + "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
	
	