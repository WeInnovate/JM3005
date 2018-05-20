package com.jm3005.learn.spring.core.noxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MySpringConfig.class);
		 Car car = context.getBean("bmw", Car.class);
		 Car car2 = context.getBean("bmw", Car.class);
		 car.drive();
		 car2.drive();

		MusicSystem ms1 = context.getBean("sony", MusicSystem.class);
		MusicSystem ms2 = context.getBean("sony", MusicSystem.class);
		System.out.println(ms1.hashCode() + " " + ms2.hashCode());
		context.close();
	}
}
