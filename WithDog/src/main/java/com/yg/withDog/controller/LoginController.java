package com.yg.withDog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yg.withDog.dto.LoginDTO;
import com.yg.withDog.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService service;
	
	@RequestMapping("login")
	public String loginForm() {
		return "/login/loginForm";
	}

	@RequestMapping("membershipForm")
	public String membershipForm() {
		return "/login/membershipForm";
	}
	
	
	@RequestMapping("loginChk")
	public String listall(Model model, LoginDTO dto) {
		boolean chk = service.loginChk(dto);
		model.addAttribute("chk", chk);
		return "list";
	}

}
