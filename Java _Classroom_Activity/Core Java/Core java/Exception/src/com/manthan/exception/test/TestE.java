package com.manthan.exception.test;

public class TestE {
	public static void main(String[] args) {
		int a[]=new int[5];
		String s=null;
		System.out.println("Main Started");
		try {
			System.out.println("Hi");
			System.out.println(a[2]);
			System.out.println(10/2);
			System.out.println("Have a good Day");
			System.out.println(s.length());
			
		}
		catch(ArithmeticException ae) {
			System.out.println("Don't Divide by zero");
		}
		catch (NullPointerException ne) {
			System.out.println("Null String");
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("Value out of boundary");
		}
		catch(Exception e) {
			System.out.println("Something went wrong");
		}
		System.out.println("Main Ended");
	}

}
