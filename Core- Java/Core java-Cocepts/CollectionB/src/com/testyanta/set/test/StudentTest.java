package com.testyanta.set.test;

import java.util.Iterator;
import java.util.TreeSet;

public class StudentTest {
	public static void main(String[] args) {
		CompareByName cib=new CompareByName();
		TreeSet<Student>ts=new TreeSet<Student>(cib);
		Student s1=new Student(2, "Kunal", 76.5);
		Student s2=new Student(4, "Ankit", 66.5);
		Student s3=new Student(1, "Simran", 54.8);
		Student s4=new Student(3, "Divya", 80.0);
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		Iterator<Student>it=ts.iterator();
		while (it.hasNext()) {
			Student student = it.next();
			System.out.println("ID is "+student.id);
			System.out.println("Name is "+student.name);
			System.out.println("Percentage is "+student.per);
			System.out.println("--------------------------");
			
		}
		
	}

}
