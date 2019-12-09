package com.testyanta.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMp {
	public static void main(String[] args) {
		HashMap<Character, String>hm=new HashMap<Character, String>();
		hm.put('M', "Man");
		hm.put('A', "Apple");
		hm.put('a', "anil");
		hm.put('F', "Fan");
		Set<Map.Entry<Character,String>> se=hm.entrySet();
		for (Entry<Character, String> entry : se) {
			Character k=entry.getKey();
			String v=entry.getValue();
			System.out.println("Key is "+k);
			System.out.println("value is "+v);
			System.out.println("--------------------------");
			
		}
		
	}

}
