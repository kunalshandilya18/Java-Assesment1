package com.manthan.empwebapp.dao;

import java.util.ArrayList;


import com.manthan.empwebapp.beans.EmployeeInfoBeans;

public interface EmployeeDAO {
	public EmployeeInfoBeans authenticateEmployee(int empId,String empPassword);
	public EmployeeInfoBeans searchEmployee(int empid);
	public boolean addEmployee(EmployeeInfoBeans employeeInfoBeans);
	public boolean updateEmployee(int empId,Long empMobile);
	public boolean deleteEmployee(int empId);
	public ArrayList<EmployeeInfoBeans> seeAllEmployee();

}
