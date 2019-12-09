package com.manthan.empwebapp.util;

import com.manthan.empwebapp.dao.EmployeeDAO;
import com.manthan.empwebapp.dao.EmployeeDAOImpl;

public class EmpDAOImplManager {
	private EmpDAOImplManager() {
		
	}
	public static EmployeeDAO getDaoInstance() {
		return new EmployeeDAOImpl();
		
	}

}
