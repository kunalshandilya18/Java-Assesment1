package com.manthan.exception.test;

public class ATMSimulator {
	void verify(int amt) {
		if(amt>40000) {
			DayLimitException x=new DayLimitException();
			throw x;
		}
	}

}
