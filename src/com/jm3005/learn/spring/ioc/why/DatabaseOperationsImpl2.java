package com.jm3005.learn.spring.ioc.why;

public class DatabaseOperationsImpl2 implements DatabaseOperations {

	@Override
	public void save(String name) {
		System.out.println(name+" Data has been saved by 2.");
	}

}
