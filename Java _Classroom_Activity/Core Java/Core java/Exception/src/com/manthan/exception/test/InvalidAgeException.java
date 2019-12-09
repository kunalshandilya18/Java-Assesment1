package com.manthan.exception.test;

public class InvalidAgeException extends Exception {
	private String msg="Sorry you are too young";
	public InvalidAgeException() {
		
	}

	public InvalidAgeException(String msg) {
		this.msg = msg;
	}
	public String getMessage() {
		return msg;
	}
	

}
