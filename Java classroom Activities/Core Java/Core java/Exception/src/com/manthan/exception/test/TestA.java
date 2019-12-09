package com.manthan.exception.test;

public class TestA {
	public static void main(String[] args) {
		System.out.println("Main Started");
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println("Dont Divide by Zero");
		}
		System.out.println("Main ended");
	}

}
