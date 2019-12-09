package com.manthan.files;

import java.io.File;
import java.io.IOException;

public class TestA {
	public static void main(String[] args) {
		
		
		File f=new File("kunal.txt");
		try {
			f.createNewFile();
			System.out.println("Created");
		} catch (IOException e) {
			System.out.println("Cannot create file");
		}
	}

}
