package com.jm3005.learn.spring.core.noxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MySpringConfig.class);
		Car car = context.getBean("bmw", Car.class);
		car.drive();
	}

}
