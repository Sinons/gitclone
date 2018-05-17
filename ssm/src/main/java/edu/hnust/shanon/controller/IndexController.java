package edu.hnust.shanon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	
	@RequestMapping("/index")
	public ModelAndView queryItems() {
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
		return modelAndView;
	}
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	@RequestMapping("/register")
	public String register() {
		return "register";
	}
	@RequestMapping("/user")
	public String user(){
		return "user";
	}
	@RequestMapping("/trolley")
	public String trolley() {
		return "trolley";
	}
}
