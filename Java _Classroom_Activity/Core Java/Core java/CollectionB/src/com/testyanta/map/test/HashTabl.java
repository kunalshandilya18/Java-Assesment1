package com.testyanta.map.test;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTabl {
	public static void main(String[] args) {
		Hashtable<Integer, Double> ht=new Hashtable<Integer, Double>();
		ht.put(1, 1.0);
		ht.put(2, 2.0);
		ht.put(4, 4.0);
		ht.put(3, 3.0);
		Set<Map.Entry<Integer,Double>>se=ht.entrySet();
		for (Entry<Integer, Double> entry : se) {
			Integer in=entry.getKey();
			Double db=entry.getValue();
			System.out.println("key is "+in);
			System.out.println("Value is "+db);
			System.out.println("----------------------");
			
		}
	}

}
