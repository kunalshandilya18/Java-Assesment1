package com.manthan.array.test;

public class TestB {
	public static void main(String[] args) {
		String[] str=new String[4];
		str[0]="Dimple";
		str[1]="Chinnu";
		str[2]="Raju";
		str[3]="Priya";
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		System.out.println("------------------------");
		double[] db=new double[4];
		db[0]=5.6;
		db[1]=2.4;
		db[2]=9.2;
		db[3]=3.4;
		for (int i = 0; i < db.length; i++) {
			System.out.println(db[i]);
		}
		System.out.println("------------------------");
		char[] ch=new char[4];
		ch[0]='A';
		ch[1]='P';
		ch[2]='P';
		ch[3]='L';
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}

	}

}
