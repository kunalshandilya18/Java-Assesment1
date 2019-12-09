package com.manthan.collection.thread.test;

public class TestA {
	public static void main(String[] args) {
		System.out.println("Before Start");
		MyTask mt=new MyTask();
		System.out.println("After Start");
		mt.start();
	}

}
