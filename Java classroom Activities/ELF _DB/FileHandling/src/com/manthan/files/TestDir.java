package com.manthan.files;

import java.io.File;

public class TestDir {
	public static void main(String[] args) {
		File f= new File("Manthan/Kunal");
		
		f.mkdirs();
	}

}
