package com.manthan.collection.set;

import java.util.HashSet;

public class TestM {
	public static void main(String[] args) {
		HashSet<Person>hs=new HashSet<Person>();
		Person p1=new Person("Kunal", 1, 1.75);
		Person p2=new Person("Ankit", 2, 1.74);
		Person p3=new Person("Divya", 4, 1.76);
		Person p4=new Person("Divya", 4, 1.76);
		hs.add(p1);
		hs.add(p2);
		hs.add(p3);
		hs.add(p4);
		for (Person person : hs) {
			System.out.println("Name is "+person.name);
			System.out.println("ID is "+person.id);
			System.out.println("Height is "+person.height);
			System.out.println("-------------------------------------");
		}
		
	}

}
