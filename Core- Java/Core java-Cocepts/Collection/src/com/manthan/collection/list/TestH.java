package com.manthan.collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestH {
	public static void main(String[] args) {
		ArrayList<Double>al= new ArrayList<Double>();
		al.add(2.4);
		al.add(5.8);
		al.add(3.6);
		al.add(4.1);
		ListIterator<Double>li=al.listIterator();
		while (li.hasNext()) {
			Double double1 = (Double) li.next();
			System.out.println(double1);
			
		}
		System.out.println("---------Backward---------");
		while (li.hasPrevious()) {
			Double double1 = (Double) li.previous();
			System.out.println(double1);
			
		}
	}

}
