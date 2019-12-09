package com.testyanta.set.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Student_Hashmap {
	public static void main(String[] args) {
		HashMap<String, ArrayList<Student_Map>>hm= new HashMap<String, ArrayList<Student_Map>>();
		
		
		ArrayList<Student_Map>al1=new ArrayList<Student_Map>();
		Student_Map s1=new Student_Map(1, "Kunal", 62.5);
		Student_Map s2=new Student_Map(2, "Ankit", 70.0);
		Student_Map s3=new Student_Map(3, "Simran", 69.2);
		Student_Map s4=new Student_Map(4, "Divya", 52.8);
		al1.add(s1);
		al1.add(s2);
		al1.add(s3);
		al1.add(s4);
		hm.put("first", al1);
		
		
		ArrayList<Student_Map>al2=new ArrayList<Student_Map>();
		Student_Map s5=new Student_Map(5, "VikaSh", 82.2);
		Student_Map s6=new Student_Map(6, "Kamal", 33.3);
		al2.add(s5);
		al2.add(s6);
		hm.put("Second", al2);
		
		
		ArrayList<Student_Map>al3=new ArrayList<Student_Map>();
		Student_Map s7=new Student_Map(7, "Githa", 56.9);
		Student_Map s8=new Student_Map(8, "Vina", 66.6);
		al3.add(s7);
		al3.add(s8);
		hm.put("Third", al3);
		
		
		Set<Map.Entry<String,ArrayList<Student_Map>>>se=hm.entrySet();
		for (Entry<String, ArrayList<Student_Map>> entry : se) {
			String str=entry.getKey();
			ArrayList<Student_Map> arr=entry.getValue();
			System.err.println(str);
			for (Entry<String, ArrayList<Student_Map>> entry2 : se) {
				
				System.out.println("Name is "+entry2);
				System.out.println("...........................");
				
			}
			System.out.println("-------------******************-----------");
			
		}
		
		
	}

}
