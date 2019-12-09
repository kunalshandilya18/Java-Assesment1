package com.manthan.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestB {
	public static void main(String[] args) {
		String msg="Hii How Are You Doing!!!!";
		
		byte[] by=msg.getBytes();
		
		try {
			FileOutputStream fout=new FileOutputStream("dhanya.txt");
			
			try {
				fout.write(by);
				System.out.println("Done");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
