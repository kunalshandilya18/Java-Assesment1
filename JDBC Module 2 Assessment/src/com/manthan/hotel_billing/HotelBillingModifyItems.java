package com.manthan.hotel_billing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class HotelBillingModifyItems {
	
	public void modifyItems() {
		Connection con = null;
		PreparedStatement pstmt = null;
		

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter New Modified Item Name: ");
		String itemName=sc.nextLine();
		System.out.println("Enter New Modified Price: ");
		double itemPrice=sc.nextDouble();
		System.out.println("Enter Item Code");
		int itemCode=sc.nextInt();
		sc.nextLine();

		try {
			//LOAD THE DRIVER
			Class.forName("com.mysql.jdbc.Driver");

			//GET CONNECTION 
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_DB", "root", "root");

			//ISSUE SQL QUERY 
			String query = " update Hotel_Bill set Food_Name=?,price=? where Item_code=?";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, itemName);
			pstmt.setDouble(2, itemPrice );
			pstmt.setInt(3, itemCode);


			int n = pstmt.executeUpdate();
			if(n>0) {

				System.out.println("Item Modified Successfully");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			//CLOSE ALL JDBC OBJECTS

			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					System.out.println("Something Went Wrong!!! Try Again");
				}
			}
		}//End Of Finally
		
	}//End Of modifyItems

}//End Of Class
