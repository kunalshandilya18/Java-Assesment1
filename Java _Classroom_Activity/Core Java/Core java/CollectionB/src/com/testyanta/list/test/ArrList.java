package com.testyanta.list.test;


import java.util.ArrayList;
import java.util.Iterator;


public class ArrList {
	public static void main(String[] args) {
		ArrayList<Double>al=new ArrayList<Double>();
		al.add(2.3);
		al.add(4.6);
		al.add(7.8);
		al.add(5.6);
		
		Iterator<Double> it=al.iterator();
		while (it.hasNext()) {
			Double double1 = (Double) it.next();
			System.out.println(double1);
		}
		
	}

}
