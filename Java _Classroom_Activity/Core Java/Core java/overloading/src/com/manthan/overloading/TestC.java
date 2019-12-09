package com.manthan.overloading;

public class TestC {
	public static void main(String[] args) {
		Person p=new Person();
		Mobile m=new Mobile();
		p.walk();
		p.m.doCall();
		p.age=30;
		p.m.model=1110;
		System.out.println("Age is "+p.age);
		System.out.println("Model is "+p.m.model);
	}

}
