package com.manthan.employeemanagement.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SearchEmployee {
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee ID");
		int empid = sc.nextInt();

		try {
			// Load the diver
			Class.forName("com.mysql.jdbc.Driver");

			// Get Connection

			String dburl = "jdbc:mysql://localhost:3306/elf_employee_db";
			con = DriverManager.getConnection(dburl, "root", "root");

			// Issue SQl Query

			String query = "select * from employee_info where emp_id=? ";
			pst = con.prepareStatement(query);
			pst.setInt(1, empid);
			rs = pst.executeQuery();

			// Process the results

			if (rs.next()) {
				System.out.println("Employee ID is found");
				System.out.println("Name = " + rs.getString("emp_name"));
				System.out.println("Salary = " + rs.getDouble("salary"));
			} else {
				System.out.println("Employee ID not Found");
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			// close jdbc objects
			if (rs != null) {
				rs.close();
			}
			if (pst != null) {
				pst.close();
			}
			if (con != null) {
				con.close();
			}

		} // End of Finally

	

	
	}// End of main

}// End of Class
