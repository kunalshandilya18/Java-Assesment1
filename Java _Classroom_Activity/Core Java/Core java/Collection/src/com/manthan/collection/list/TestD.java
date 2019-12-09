package com.manthan.collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestD {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(5);
		al.add('F');
		al.add(2.4);
		al.add("Simran");
		ListIterator lit=al.listIterator();
		while (lit.hasNext()) {
			Object object = (Object) lit.next();
			System.out.println(object);
			
		}
		System.out.println("-----Backward----------");
		while (lit.hasPrevious()) {
			Object object = (Object) lit.previous();
			System.out.println(object);
		}
	}

}
