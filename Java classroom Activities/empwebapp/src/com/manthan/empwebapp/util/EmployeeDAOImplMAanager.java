package com.manthan.empwebapp.util;

import com.manthan.empwebapp.dao.EmployeeDAO;
import com.manthan.empwebapp.dao.EmployeeDAOImpl;

public class EmployeeDAOImplMAanager {
	private EmployeeDAOImplMAanager() { //restricting others to make object......

	}
	public static EmployeeDAO getDaoManager() {
		return new EmployeeDAOImpl();
	}
}
