package com.manthan.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linklis {
	public static void main(String[] args) {
		LinkedList li=new LinkedList();
		li.add(23);
		li.add('F');
		li.add(2.4);
		li.add("Priya");
		System.out.println("---------For-----------");
		for (int i = 0; i < li.size(); i++) {
			Object r=li.get(i);
			System.out.println(r);
		}
		System.out.println("------for each-----------");
		for (Object object : li) {
			System.out.println(object);
		}
		System.out.println("---------Iterator---------");
		Iterator it=li.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
			
		}
		System.out.println("-------List Iterator---------");
		ListIterator lit=li.listIterator();
		while (lit.hasNext()) {
			Object object = (Object) lit.next();
			System.out.println(object);
			
		}
		System.out.println("-------Backward-----------");
		while (lit.hasPrevious()) {
			Object object = (Object) lit.previous();
			System.out.println(object);
			
		}
	}

}
