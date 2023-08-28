package com.login.login.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.login.entity.LoginInfo;

public interface LoginDaoLayer extends JpaRepository<LoginInfo, String> {

}
