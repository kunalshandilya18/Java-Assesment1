package com.testyanta.set.test;

import java.util.Comparator;

public class TestC{
	public static void main(String[] args) {
		Comparator<Student> comId=(o1,o2)->{
			
				if(o1.id>o2.id) {
					return 1;
				}
				else if(o1.id<o2.id) {
					return -1;
				}
				else {
					return 0;
				}
			
		};
		

	}
}
