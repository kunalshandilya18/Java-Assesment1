package com.manthan.employeemanagement.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AddEmployee {
	public static void main(String[] args) throws SQLException {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Employee ID");
		int empid=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Name");
		String name=sc.nextLine();
		
		System.out.println("Enter Age");
		int age=sc.nextInt();
		
		System.out.println("Enter Salary");
		double salary=sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Enter Designation");
		String desg=sc.nextLine();
		
		System.out.println("Enter Mobile No");
		long mobno=sc.nextLong();
		
		
		Connection con=null;
		PreparedStatement pst=null;
		
		
		
		try {
			//Load Driver
			
			Class.forName("com.mysql.jdbc.Driver");
			
			//Get Connection
			
			String dburl="jdbc:mysql://localhost:3306/elf_employee_db";
			con=DriverManager.getConnection(dburl,"root","root");
			
			//Issue Query
			
			String query="insert into employee_info values(?,?,?,?,?,?)";
			pst=con.prepareStatement(query);
			pst.setInt(1,empid);
			pst.setString(2,name);
			pst.setInt(3,age);
			pst.setDouble(4,salary);
			pst.setString(5,desg);
			pst.setLong(6,mobno);
			int n=pst.executeUpdate();
			
			//Process the results
			
			if(n>0) {
				System.out.println("Record Entered Succesfully");
			}
			else {
				System.out.println("Record not Entered");
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
		}//Try Catch Finally End
		
	}//end of main
	

}//End of class
