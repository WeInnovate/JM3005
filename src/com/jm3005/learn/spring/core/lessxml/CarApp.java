package com.jm3005.learn.spring.core.lessxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-config-lessxml.xml");
		Car car = (Car) context.getBean("hondaCity");
		car.driveTheCar();
	}

}
