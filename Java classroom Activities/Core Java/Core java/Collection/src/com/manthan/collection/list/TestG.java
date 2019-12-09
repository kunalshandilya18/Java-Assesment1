package com.manthan.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestG {
	public static void main(String[] args) {
		ArrayList<Double>al= new ArrayList<Double>();
		al.add(2.4);
		al.add(5.8);
		al.add(3.6);
		al.add(4.1);
		Iterator<Double> it=al.iterator(); 
		while (it.hasNext()) {
			Double double1 = (Double) it.next();
			System.out.println(double1);
			
		}
	}

}
