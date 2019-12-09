package com.manthan.exception.test;

public class IRCTC {
	void confirm(){
		System.out.println("Confirm Started");
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException i) {
			System.out.println("Exception caught at confirm");
			throw i;
		}
		finally {
			System.out.println("Confirm ended");
		}
		
	}

}
