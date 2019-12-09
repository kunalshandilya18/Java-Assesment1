package com.manthan.collection.thread.test;

public class TestB {
	public static void main(String[] args) {
		System.out.println("Main Started");
		MyTask mt1=new MyTask();
		mt1.start();
		System.out.println("Main Ended");
	}

}
