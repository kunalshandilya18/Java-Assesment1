package com.manthan.exception.test;

import java.io.IOException;

public class TestH {
	public static void main(String[] args) {
		Demo d=new Demo();
		try {
			d.run();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
