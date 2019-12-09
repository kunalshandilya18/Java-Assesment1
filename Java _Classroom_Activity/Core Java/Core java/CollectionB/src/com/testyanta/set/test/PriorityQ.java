package com.testyanta.set.test;

import java.util.PriorityQueue;

public class PriorityQ {
	public static void main(String[] args) {
		PriorityQueue<Double>pq=new PriorityQueue<Double>();
		pq.add(63.6);
		pq.add(73.5);
		pq.add(66.3);
		pq.add(32.3);
		for (Double double1 : pq) {
			System.out.println(double1);
		}
		
	}

}
