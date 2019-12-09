package com.manthan.exception.test;

import java.io.File;
import java.io.IOException;

public class TestG {
	public static void main(String[] args) {
		System.out.println("Fie Started");
		File f=new File("Kunal.txt");
		try {
			f.createNewFile();
			System.out.println("File created");
		}
		catch(IOException e) {
			System.out.println("Sorry cannot create thr file");
		}
		System.out.println("Main ended");
	}

}
