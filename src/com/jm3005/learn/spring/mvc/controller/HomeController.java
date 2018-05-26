package com.jm3005.learn.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showHomePage() {
		return "index";
	}
	
	@RequestMapping("/data")
	public @ResponseBody String showSomeData() {
		return "name: Atul Dwivedi";
	}

}
