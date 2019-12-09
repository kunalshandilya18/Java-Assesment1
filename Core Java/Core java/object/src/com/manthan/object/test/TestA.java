package com.manthan.object.test;

public class TestA {
	public static void main(String[] args) {
		Student s=new Student("Priya",1,76.9);
		Student t=new Student("Priya",1,76.9);
		boolean res=s.equals(t);
		System.out.println(res);
	}

}
