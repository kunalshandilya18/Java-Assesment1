package com.manthan.overloading;

public class DB {
	void save(Student stu) {
		System.out.println("------Saving Student to DB--------");
		System.out.println("Name is "+stu.getName());
		System.out.println("ID is "+stu.getId());
	}

}
