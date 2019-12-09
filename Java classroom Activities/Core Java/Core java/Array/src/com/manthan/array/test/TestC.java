package com.manthan.array.test;

public class TestC {

	public static void main(String[] args) {
		String[] st= {"Priya","Dimple","Chinnu","Githa"};
		for (int i=0;i<st.length;i++) {
			System.out.println(st[i]);

		}
		System.out.println("-------------");
		for (int i = st.length-1; i >= 0; i--) {

			System.out.println(st[i]);
		}
	}

}
