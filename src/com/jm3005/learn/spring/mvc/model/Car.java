package com.jm3005.learn.spring.mvc.model;

import java.util.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.jm3005.learn.spring.mvc.validation.ModelNumber;

import lombok.Data;

@Data
public class Car {
	private String companyName;

	@NotNull(message=" is required")
	private String carName;
	
	
	@Max(value=6, message=" more than 6 seats are not allowed")
	private int seats;
	
	private String typeOfCar;
	
	private String manufacturedIn;
	
	private String[] airbags;
	
	private boolean abs;
	
	@Size(max=10, message=" should not exceed 10")
	private String comment;
	
	@ModelNumber(value="DOM", message = " wrong prefix")
	@Pattern(regexp="^[a-zA-Z0-9]{6}", message=" not matching the pattern")
	private String modelNumber;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@Future(message = " future date is required")
	private Date deliveryDate;
	
	
	
}
