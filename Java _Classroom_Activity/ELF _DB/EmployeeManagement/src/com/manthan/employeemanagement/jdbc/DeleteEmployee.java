package com.manthan.employeemanagement.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteEmployee {
	public static void main(String[] args) throws SQLException {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee id");
		int empid=sc.nextInt();

		Connection con=null;
		PreparedStatement pst=null;

		try {
			//Load Driver
			Class.forName("com.mysql.jdbc.Driver");


			//Get Connection
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db","root","root");


			//Issue SQL Query
			String query="delete from employee_info where emp_id=?";
			pst=con.prepareStatement(query);
			pst.setInt(1,empid);
			int n=pst.executeUpdate();


			//Process Result
			if(n>0) {
				System.out.println("Deleted Successfully");
			}
			else {
				System.out.println("Not Deleted");
			}
		}
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			//Close jdbc objects
			if(con!=null) {
				con.close();
			}
			if(pst!=null) {
				pst.close();
			}
		}//Try Catch Finally Ended




	}//main ended

}//class ended
