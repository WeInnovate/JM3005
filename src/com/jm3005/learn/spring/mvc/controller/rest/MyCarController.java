package com.jm3005.learn.spring.mvc.controller.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jm3005.learn.spring.mvc.model.Car;

@RestController
@RequestMapping(value = "/car")
public class MyCarController {

	@GetMapping
	public @ResponseBody Car getCar() {
		Car car = new Car();
//		car.setCarName("Audi X");
//		car.setCompanyName("Audi");
		return car;

	}

	@PostMapping(consumes = { MediaType.APPLICATION_JSON_VALUE }, 
			produces = { MediaType.APPLICATION_JSON_VALUE })
	public @ResponseBody Car getCar(@RequestBody Car car) {
//		car.setAbs(true);
		return car;

	}

}
