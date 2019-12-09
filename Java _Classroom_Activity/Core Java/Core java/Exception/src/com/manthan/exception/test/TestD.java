package com.manthan.exception.test;

public class TestD {
	public static void main(String[] args) {
		int a[]=new int[3];
		System.out.println("Main Started");
		try {
			System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Out Of Bound");
		}
		
		System.out.println("Main Ended");
	}

}
