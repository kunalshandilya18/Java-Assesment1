package com.manthan.wrapper.test;

public class TestA {
public static void main(String[] args) {
	Integer k=new Integer(234);
	int i=k;//auto-boxing
	System.out.println(i);
	int r=90;
	Integer p=r;//auto-unboxing
	System.out.println(p);
}
}
