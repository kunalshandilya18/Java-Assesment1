package com.manthan.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashS {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("Priya");
		hs.add(14);
		hs.add("Divya");
		hs.add('M');
		System.out.println("---------Using foreach-----------");
		for (Object object : hs) {
			System.out.println(object);
			
		}
		System.out.println("---------Using Iterator-----------");
		Iterator it=hs.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
			
		}
	}
	

}
