package com.manthan.collection.list;

import java.util.ArrayList;

public class TestA {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(5);
		al.add('F');
		al.add(2.4);
		al.add("Simran");
		for (int i = 0; i < al.size(); i++) {
			Object obj=al.get(i);
			System.out.println(obj);
			
		}
		
		
	}

}
