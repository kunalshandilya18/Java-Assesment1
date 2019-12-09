package com.manthan.exception.test;

public class TestJ {
	public static void main(String[] args) {
		System.out.println("Main started");
		int m=41000;
		ATMSimulator atm=new ATMSimulator();
		try {
			atm.verify(m);
		}
		catch(DayLimitException de) {
			de.printStackTrace();
			System.out.println(de.getMessage());
		}
		System.out.println("Main ended");
	}

}
