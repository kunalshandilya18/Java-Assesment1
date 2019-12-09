package com.manthan.exception.test;

public class TestK {
	public static void main(String[] args) {
		AgeSimulator as=new AgeSimulator();
		try {
			as.checkAge(20);
			System.out.println("Welcome and enjoy the party");

		}
		catch(InvalidAgeException ie) {
			ie.printStackTrace();
			System.out.println(ie.getMessage());
		}
	}
 
}
