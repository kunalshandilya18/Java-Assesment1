package com.manthan.files;

import java.io.FileWriter;
import java.io.IOException;

public class TestWriter {
	public static void main(String[] args) {
		String msg="Good Morning";
		 char ch[]=msg.toCharArray();
		 
		 try {
			FileWriter fileWriter=new FileWriter("Divya.txt");
			
			fileWriter.write(ch);
			fileWriter.flush();
			
			System.out.println("Done");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

}
