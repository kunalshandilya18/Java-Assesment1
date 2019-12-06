package com.manthan.hotel_billing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class HotelBillingRemoveItem {
	
	
	public void removeItem() {
		Connection con = null;
		PreparedStatement pstmt = null;
		

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Food Code: ");
		int itemCode=sc.nextInt();
		sc.nextLine();


		try {
			//LOAD THE DRIVER
			Class.forName("com.mysql.jdbc.Driver");

			//GET CONNECTION 
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_DB", "root", "root");

			//ISSUE SQL QUERY 
			String query = "delete from Hotel_Bill where Item_code=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, itemCode);


			int n = pstmt.executeUpdate();
			if(n>0) {

				System.out.println("Item Removed Successfully");

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
	}//End Of removeItems

}//End Of Class
