package com.manthan.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetstr {
	public static void main(String[] args) {
		TreeSet<String>ts=new TreeSet<String>();
		ts.add("kunal");
		ts.add("ankit");
		ts.add("simran");
		ts.add("divya");
		System.out.println("--------For Each-------------");
		for (String string : ts) {
			System.out.println(string);

		}
		System.out.println("--------Iterator-------------");
		Iterator<String> it=ts.iterator();
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println(string);

		}


	}

}
