package com.manthan.exception.test;

public class TestC {
	public static void main(String[] args) {
		System.out.println("Main Started");
		String s=null;
		try {
			System.out.println(10/0);
			System.out.println("Hii");
			System.out.println("Have a Good Day");
			System.out.println(s.length());

		}
		catch(ArithmeticException a) {
			System.out.println("Don't Divide by zero");
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Main Ended");
	}

}
