package com.jm3005.learn.spring.di.why;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		Car car = (Car) ctx.getBean("car");
		car.driveTheCar();
	}

}
