package com.jm3005.learn.spring.ioc.why;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		DatabaseOperations obj = (DatabaseOperations)ctx.getBean("anyName");
		obj.save("User");
	}
}
