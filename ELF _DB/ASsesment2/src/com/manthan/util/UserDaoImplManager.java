package com.manthan.util;

public class UserDaoImplManager {
	
private UserDaoImplManager() {
		
	}
	public static UserDaoImplManager getDaoInstance() {
		return new UserDaoImplManager();
		
	}

}
