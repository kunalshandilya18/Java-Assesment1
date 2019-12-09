package com.manthan.exception.test;

public class TestB {
	public static void main(String[] args) {
		System.out.println("Main Started");
		String s=null;
		try {
			System.out.println(s.length());
		}
		catch(NullPointerException e) {
			System.out.println("Dont deal with null");
		}
		System.out.println("Main Ended");
	}

}
