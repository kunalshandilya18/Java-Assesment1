package com.manthan.collection.set;

import java.util.TreeSet;

public class TestN {
	public static void main(String[] args) {
		TreeSet<Person>ts=new TreeSet<Person>();
		Person p1=new Person("Kunal", 3, 1.75);
		Person p2=new Person("Ankit", 1, 1.65);
		Person p3=new Person("Simran", 2, 1.5);
		Person p4=new Person("Divya", 4, 1.45);
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		ts.add(p4);
		for (Person person : ts) {
			System.out.println("Name is "+person.name);
			System.out.println("ID is "+person.id);
			System.out.println("Height is "+person.height);
			System.out.println("---------------------------------");
			
		}
	}

}
