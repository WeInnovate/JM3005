package com.jm3005.learn.spring.mvc.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jm3005.learn.spring.mvc.model.Car;

@Controller
@RequestMapping("/car")
public class CarController {
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@RequestMapping(value = "/show-car-form", method = RequestMethod.GET)
	public String showCarForm(Model model) {
		model.addAttribute("car", new Car());
		return "car-form";
	}
	
	@RequestMapping(value="/process-car-data")
	public String processCarData(@Valid @ModelAttribute("car") Car car, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "car-form";
		}
		System.out.println(car);
		return "car";
	}

}
