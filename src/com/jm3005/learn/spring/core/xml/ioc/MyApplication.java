package com.jm3005.learn.spring.core.xml.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		DatabaseOperations obj1 = (DatabaseOperations)ctx.getBean("anyName");
		DatabaseOperations obj2 = (DatabaseOperations)ctx.getBean("anyName");
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
//		obj.save("User");
	}
}
