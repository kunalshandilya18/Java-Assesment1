package com.manthan.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashStr {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("Divya");
		hs.add("Kunal");
		hs.add("Ankit");
		hs.add("Simran");
		System.out.println("-----------Using For each----------");
		for (String string : hs) {
			System.out.println(string);
			
		}
		System.out.println("-----------Using Iterator----------");
		Iterator<String>it=hs.iterator();
		while (it.hasNext()) {
			String string = (String) it.next();
			System.out.println(string);
			
		}
		
	}

}
