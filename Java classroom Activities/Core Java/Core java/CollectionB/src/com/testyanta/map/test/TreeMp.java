package com.testyanta.map.test;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMp {
	public static void main(String[] args) {
		TreeMap<Integer, String>tm=new TreeMap<Integer, String>();
		tm.put(3, "Kunal");
		tm.put(4, "Ankit");
		tm.put(2, "Simran");
		tm.put(1, "Divya");
		Set<Map.Entry<Integer,String>>se=tm.entrySet();
		for (Entry<Integer, String> entry : se) {
			Integer in=entry.getKey();
			String str=entry.getValue();
			System.out.println(in);
			System.out.println(str);
			System.out.println("------------------------------");
		}
	}

}
