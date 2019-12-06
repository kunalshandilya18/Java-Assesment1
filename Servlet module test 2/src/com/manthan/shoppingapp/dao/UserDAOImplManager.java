package com.manthan.shoppingapp.dao;

public class UserDAOImplManager {
	
	private UserDAOImplManager() { 

	}
	public static ShoppingDAO getDaoManager() {
		return new ShoppingDAOImpl();
	}

}
