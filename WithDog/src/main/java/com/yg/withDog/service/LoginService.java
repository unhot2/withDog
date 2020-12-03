package com.yg.withDog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yg.withDog.dao.LoginDAO;
import com.yg.withDog.dto.LoginDTO;

@Service
public class LoginService {
	
	@Autowired
	private LoginDAO dao;
	
	public boolean loginChk(LoginDTO dto) {
	return true;
	}
	
	public List<LoginDTO> listall() {
		return dao.listall();
	}
}
