package com.manthan.collection.set;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.TreeSet;

public class TreeS {
	
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
        System.out.println("---------For Each-----------");
		for (Object object : ts) {
			System.out.println(object);
		}
		System.out.println("---------Iterator-----------");
		Iterator it=ts.iterator();
		while (it.hasNext()) {
			Object object = (Object) it.next();
			System.out.println(object);
			
		}
	}

}
