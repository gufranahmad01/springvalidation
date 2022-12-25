package com.spring.controller;

import javax.validation.Valid;
import javax.validation.constraints.Email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.entities.Login;
import com.spring.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/login")
	public String viewLoginForm() {
		return "login";
	}
	
	@RequestMapping("/saveLogin")
	public String saveLoginDetails(@Valid @ModelAttribute("l")Login login,BindingResult result,Model model) {
		loginService.saveLogin(login);
		
        if(result.hasErrors()) {
            loginService.toString();
        	System.out.println(result);
        	model.addAttribute("result",result);
        	return "login";
        }
        model.addAttribute("login",login);
		return "error";	
		
	}
}
