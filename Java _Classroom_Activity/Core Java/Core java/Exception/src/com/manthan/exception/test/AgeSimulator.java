package com.manthan.exception.test;

public class AgeSimulator {
	void checkAge(int age) throws InvalidAgeException {
		if(age<18) {
			InvalidAgeException i= new InvalidAgeException();
			throw i;
		}
	}

}
