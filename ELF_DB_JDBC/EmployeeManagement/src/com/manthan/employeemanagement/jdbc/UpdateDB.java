package com.manthan.employeemanagement.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDB {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Connection con=null;
		Statement st=null;
		
		try {
			//Load The Driver

			//			com.mysql.jdbc.Driver d=new com.mysql.jdbc.Driver();
			//			DriverManager.registerDriver(d);
			Class.forName("com.mysql.jdbc.Driver").newInstance();


			//Get Connection via Driver

			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db?user=root&password=root");


			//Issue Sql Query

			st=con.createStatement();
			int n=st.executeUpdate("update employee_info SET mobile_no=7608867197 where(emp_id=105) ");
			if(n>0) {
				System.out.println("Record updated");
			}
			else {
				System.out.println("Record not update");
			}
			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}

		//closing all jdbc objects
		
		finally {

			
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

	


