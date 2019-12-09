package com.manthan.collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkHashSe {
	public static void main(String[] args) {
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("Kunal");
		lhs.add(20);
		lhs.add(2.4);
		lhs.add('M');
		lhs.add(null);
		lhs.add(null);
        System.out.println("---------For Each-----------");
		for (Object object : lhs) {
			System.out.println(object);
		}
		System.out.println("---------Iterator-----------");
		Iterator it=lhs.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
			
		}
	}

}
