package com.yg.withDog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.yg.withDog.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService service;
	
	@RequestMapping("login")
	public String loginForm() {
		return "/login/loginForm";
	}

	@RequestMapping("listall")
	public String listall(Model model) {
		model.addAttribute("list", service.listall());
		System.out.println("들어온 값 id"+service.listall().get(0).getUserId());
		System.out.println("들어온 값 pwd"+service.listall().get(0).getUserPwd());
		System.out.println("들어온 값 id"+service.listall().get(1).getUserId());
		System.out.println("들어온 값 pwd"+service.listall().get(1).getUserPwd());
		return "list";
	}

}
