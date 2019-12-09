package com.manthan.empwebapp.beans;

public class EmployeeInfoBean {
	private int empId;
	private String empName;
	private int age;
	private String designaton;
	private double salary;
	private long mobileNo;
	
	//Generate Getter Setter
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDesignaton() {
		return designaton;
	}
	public void setDesignaton(String designaton) {
		this.designaton = designaton;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	

}//End of class
