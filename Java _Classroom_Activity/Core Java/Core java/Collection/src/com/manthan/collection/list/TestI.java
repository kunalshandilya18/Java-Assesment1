package com.manthan.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestI {
	public static void main(String[] args) {
		LinkedList<String> li=new LinkedList<String>();
		li.add("Kunal");
		li.add("Ankit");
		li.add("Simran");
		li.add("Dimple");
		System.out.println("---------For-------");
		for (int i = 0; i < li.size(); i++) {
			String s=li.get(i);
			System.out.println(s);

		}
		System.out.println("---------For Each-------");
		for (String string : li) {
			System.out.println(string);

		}
		System.out.println("---------Iterator-------");

		Iterator<String> it=li.iterator();
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println(string);

		}
		System.out.println("---------List Iterator-------");
		ListIterator<String> lit=li.listIterator();	
		while (lit.hasNext()) {
			String string = (String) lit.next();
			System.out.println(string);
			
		}
		System.out.println("---------Backward-------");
		while (lit.hasPrevious()) {
			String string = (String) lit.previous();
			System.out.println(string);
			
		}
	}

}
