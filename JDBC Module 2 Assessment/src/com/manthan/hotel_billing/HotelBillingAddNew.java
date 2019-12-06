package com.manthan.hotel_billing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class HotelBillingAddNew {

	public void addNewOrder() {

		Connection con = null;
		PreparedStatement pstmt = null;


		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Item Code: ");
		int itemCode=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Item Name: ");
		String itemName=sc.nextLine();
		System.out.println("Enter Price of Item");
		double itemPrice=sc.nextDouble();

		try {
			//LOAD THE DRIVER
			Class.forName("com.mysql.jdbc.Driver");

			//GET CONNECTION 
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_DB", "root", "root");

			//ISSUE SQL QUERY 
			String query = " insert into Hotel_Bill values (?,?,?)";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, itemCode);
			pstmt.setString(2, itemName );
			pstmt.setDouble(3, itemPrice);

			int n = pstmt.executeUpdate();
			if(n>0) {

				System.out.println("New Item Added successfully!!!!");

			}
		} catch (Exception e) {
			System.out.println("Something Went Wrong!!! Try Again");
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
					e.printStackTrace();
				}
			}
		}//End Of Finally
		
	}//End Of addNewOrder

}//End of Class
