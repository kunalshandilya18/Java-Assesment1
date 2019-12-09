package com.manthan.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
	public static void main(String[] args) {
		Properties pr=new Properties();
		
		pr.setProperty("driver name", "com.mysql.jdbcDriver");
		pr.setProperty("url", "jdbc:mysql://localhost:3306");
		pr.setProperty("user", "scott");
		pr.setProperty("password", "root");
		
		try {
			FileOutputStream fout=new FileOutputStream("myDBConfig.properties");
			
			try {
				pr.store(fout, "Storing data");
				System.out.println("Done");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
