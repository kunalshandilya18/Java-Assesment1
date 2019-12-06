package com.manthan.shoppingapp.dao;

import com.manthan.shoppingapp.beans.ProductInfoBeans;
import com.manthan.shoppingapp.beans.UserInfoBeans;

public interface ShoppingDAO {
	
	public UserInfoBeans authenticate(String emailId,String password);
	public boolean register(UserInfoBeans userInfoBeans);
	public ProductInfoBeans searchProduct(int productID);

}
