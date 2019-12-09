package com.manthan.employeemanagement.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFirstJdbcProgram {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			//Load The Driver

			//			com.mysql.jdbc.Driver d=new com.mysql.jdbc.Driver();
			//			DriverManager.registerDriver(d);
			Class.forName("com.mysql.jdbc.Driver").newInstance();


			//Get Connection via Driver

			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db?user=root&password=root");


			//Issue Sql Query

			st=con.createStatement();
			rs=st.executeQuery("select * from employee_info");
			
			//Process the results
			while (rs.next()) {
				int emp_id=rs.getInt("emp_id");
				String name=rs.getString("emp_name");
				int age=rs.getInt("age");
				double salary=rs.getInt("salary");
				String designation=rs.getString("designation");
				long mobile_no=rs.getLong("mobile_no");
				
				
				System.out.println("Employee ID : "+emp_id);
				System.out.println("Employee Age : "+age);
				System.out.println("Employee Salary : "+salary);
				System.out.println("Employee Designation : "+designation);
				System.out.println("Employee Name : "+name);
				System.out.println("Employee Mobile No : "+mobile_no);
				System.out.println("---------------------------------------");


			}//While End
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}

		//closing all jdbc objects
		finally {

			if(rs!=null) {
				try {
					rs.close();
				} 
				catch (SQLException e) {

					e.printStackTrace();
				}
			}
			if(st!=null) {
				try {
					st.close();
				}
				catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				}
				catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}


		}// outer try catch finally End




	}//End of Main

}//End of Class
