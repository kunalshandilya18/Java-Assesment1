package com.manthan.collection.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vect {
public static void main(String[] args) {
	Vector v=new Vector();
	v.add('A');
	v.add(2.4);
	v.add(15);
	v.add("Deepa");
	System.out.println("-------For---------");
	for (int i = 0; i < v.size(); i++) {
		Object obj=v.get(i);
		System.out.println(obj);
		
	}
	System.out.println("-------For each---------");
	for (Object object : v) {
		System.out.println(object);
		
	}
	System.out.println("-------Iterator---------");
	Iterator it=v.iterator();
	while (it.hasNext()) {
		Object object = (Object) it.next();
		System.out.println(object);
		
	}
	System.out.println("-------List Iterator---------");
	ListIterator lit=v.listIterator();
	while (lit.hasNext()) {
		Object object = (Object) lit.next();
		System.out.println(object);
		
	}
	System.out.println("-------backward---------");
	while (lit.hasPrevious()) {
		Object object = (Object) lit.previous();
		System.out.println(object);
		
	}
	
	
}
}
