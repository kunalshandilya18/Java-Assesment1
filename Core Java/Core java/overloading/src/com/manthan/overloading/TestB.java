package com.manthan.overloading;

public class TestB {
	public static void main(String[] args) {
		Student s=new Student();
		s.setId(2);
		s.setName("Divya");
		DB d=new DB();
		d.save(s);
	}

}
