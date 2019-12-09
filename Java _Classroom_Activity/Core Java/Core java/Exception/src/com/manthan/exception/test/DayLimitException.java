package com.manthan.exception.test;

public class DayLimitException extends RuntimeException{
	private String msg="Sorry you crossed the day limit";
	public DayLimitException() {
		
	}
	public DayLimitException(String msg) {
		this.msg=msg;
	}
	public String getMessage() {
		return msg;
	}
	

}
