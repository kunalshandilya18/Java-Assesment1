package com.manthan.empwebapp.dao;

import com.manthan.empwebapp.beans.EmployeeInfoBean;

public interface EmployeeDAO {
	public boolean addEmployee(EmployeeInfoBean bean);
	public EmployeeInfoBean searchEmployee(int enpId);
	public EmployeeInfoBean authenticate(int empId,String password);
	public boolean updateEmployee(int empId,long mobile);
	public boolean deleteEmployee(int empId);
}
