package com.manthan.array.test;

public class TestF {
	public static void main(String[] args) {
		Student[] s=new Student[4];
		Student s1=new Student("Kunal", 1 , 80.2);
		Student s2=new Student("Anitha", 2 , 79.6);
		Student s3=new Student("Simran", 3 , 77.3);
		Student s4=new Student("Ankit", 3 , 76.6);
		s[0]=s1;
		s[1]=s2;
		s[2]=s3;
		s[3]=s4;
		for (Student student : s) {
			System.out.println(student.name);
			System.out.println(student.roll);
			System.out.println(student.percentage);
			System.out.println("--------------------------");
			
		}
		
	}

}
