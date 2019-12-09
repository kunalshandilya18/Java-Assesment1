package com.manthan.collection.list;

import java.util.ArrayList;

public class TestJ {
	public static void main(String[] args) {
		ArrayList<Student> stu=new ArrayList<Student>();
		Student s1=new Student(1,"Anil",67.5);
		Student s2=new Student(2,"Bhanu",60.5);
		Student s3=new Student(3,"Deepa",63.5);
		Student s4=new Student(4,"Geetha",69.5);
		stu.add(s1);
		stu.add(s2);
		stu.add(s3);
		stu.add(s4);
		for (int i = 0; i < stu.size(); i++) {
			Student s=stu.get(i);
			System.out.println("ID is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.per);
			System.out.println("-------------------------------");
		}
		System.out.println("-------------Using for each------------------");
		for (Student student : stu) {
			System.out.println(student.id);
			System.out.println(student.name);
			System.out.println(student.per);
			System.out.println("----------------------------");
		}
		
		
		
		
	}

}
