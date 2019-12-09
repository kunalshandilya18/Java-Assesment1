package com.testyanta.set.test;

public class TestLAmbFact {
	public static void main(String[] args) {
		LamndFact lf=m->{
			int f=1;
			for(int i=1;i<=m;i++) {
				f=f*i;
			}
			return f;
		};
		int y=lf.fact(5);
		System.out.println(y);
	}

}
