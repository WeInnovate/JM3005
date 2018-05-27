package com.jm3005.learn.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jm3005.learn.spring.mvc.model.Car;

@Controller
@RequestMapping("/car")
public class CarController {

	@RequestMapping(value = "/show-car-form", method = RequestMethod.GET)
	public String showCarForm(Model model) {
		model.addAttribute("car", new Car());
		return "car-form";
	}
	
	@RequestMapping(value="/process-car-data")
	public String processCarData(@ModelAttribute("car") Car car) {
		System.out.println(car);
		return "car";
	}

}
