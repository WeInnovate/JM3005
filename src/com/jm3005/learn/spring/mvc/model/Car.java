package com.jm3005.learn.spring.mvc.model;

public class Car {
	private String companyName;

	private String carName = "Audi";
	
	private String typeOfCar;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getTypeOfCar() {
		return typeOfCar;
	}

	public void setTypeOfCar(String typeOfCar) {
		this.typeOfCar = typeOfCar;
	}

	@Override
	public String toString() {
		return "Car [companyName=" + companyName + ", carName=" + carName + ", typeOfCar=" + typeOfCar + "]";
	}
}
