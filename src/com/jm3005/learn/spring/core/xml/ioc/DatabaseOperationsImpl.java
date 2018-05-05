package com.jm3005.learn.spring.core.xml.ioc;

public class DatabaseOperationsImpl implements DatabaseOperations {

	@Override
	public void save(String name) {
		System.out.println(name+" Data has been saved.");
	}

}
