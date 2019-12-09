package com.manthan.collection.thread.test;

public class PvrTest {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Started");
		PVR i=new PVR();
		User t1=new User(i);
		User t2=new User(i);
		t1.start();
		t1.sleep(2000);
		t2.start();
		t2.sleep(2000);
		System.out.println("Main Ended");
	}

}
