package com.hwan.proc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.hwan.proc.dto.User;
import com.hwan.proc.service.UserService;

@Controller
public class UserController {
	@Autowired
	public UserService userService;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/user")
	public String search(String id,Model model) {
		
		User user = userService.select("ssafy");
		model.addAttribute("user",user);
		
	
		return "index";
	}
}
