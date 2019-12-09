package com.manthan.exception.test;

public class Paytm {
	void book() {
		System.out.println("Book Started");
		IRCTC i=new IRCTC();
		try {
			i.confirm();
		}
		catch(ArithmeticException e) {
			System.out.println("Exception caught at book");
		}
		
		System.out.println("Book Ended");
	}

}
