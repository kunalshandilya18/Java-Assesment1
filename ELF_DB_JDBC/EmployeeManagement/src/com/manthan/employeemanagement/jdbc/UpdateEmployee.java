package com.manthan.employeemanagement.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateEmployee {
	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee id");
		int empid=sc.nextInt();
		
		System.out.println("Enter Mobile no");
		long mobno=sc.nextLong();
		
		Connection con=null;
		PreparedStatement pst=null;
		
		try {
			//Load Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//Get Connection
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db","root","root");
	        
			//Issue Sql query
			pst=con.prepareStatement("update employee_info set mobile_no=? where emp_id=?");
			pst.setLong(1,mobno);
			pst.setInt(2,empid);
			int n=pst.executeUpdate();
			
			//Process Result
			if (n>0) {
				System.out.println("Updated Successfully");
			}
			else {
				System.out.println("cant Update : Enter correct employeeid");
			}
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			//close jdbc objects
			if(con!=null) {
				con.close();
			}
			if(pst!=null) {
				pst.close();
			}
		}
	}//main ended

}//class ended
