package com.manthan.exception.test;


public class TestF {
	public static void main(String[] args) {
		System.out.println("Main Started");
		Paytm p=new Paytm();
		try {
			p.book();
		}
		catch(ArithmeticException ae) {
			System.out.println("Exception caught at main");
		}
		
		System.out.println("Main ended");
	}

}
