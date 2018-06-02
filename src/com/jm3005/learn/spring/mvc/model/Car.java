package com.jm3005.learn.spring.mvc.model;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class Car {
	private String companyName;

	@NotNull(message=" is required")
	private String carName;
	
	private String typeOfCar;
	
	private String manufacturedIn;
	
	private String[] airbags;
	
	private boolean abs;
	
	private String comment;
}
