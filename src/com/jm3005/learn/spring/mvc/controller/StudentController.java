package com.jm3005.learn.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {

	@RequestMapping("/show-student-form")
	public String showStudentForm() {
		return "student-form";
	}

	@RequestMapping(value = "/process-student-data", method = RequestMethod.POST)
	public String processStudentData(HttpServletRequest request, Model model) {
		String studentName = request.getParameter("nm");
		System.out.println("I'm running..."+studentName);
		
		model.addAttribute("std", studentName);
		return "student";
	}

}
