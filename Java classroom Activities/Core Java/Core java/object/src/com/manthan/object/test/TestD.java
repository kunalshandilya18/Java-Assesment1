package com.manthan.object.test;

public class TestD {
	public static void main(String[] args) {
		Animal a=new Cow();
		Cow r=(Cow)a;
		r.eat();
		r.run();
		r.cost=100;
		r.size=8.6;
		System.out.println("Cost is "+r.cost);
		System.out.println("Size is "+r.size);
	}

}
