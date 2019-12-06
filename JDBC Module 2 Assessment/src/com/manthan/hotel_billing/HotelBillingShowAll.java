package com.manthan.hotel_billing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HotelBillingShowAll  {

	public void showAll() {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			//LOAD THE DRIVER
			Class.forName("com.mysql.jdbc.Driver");

			//GET CONNECTION 
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_DB", "root", "root");

			//ISSUE SQL QUERY 
			String query = " select * from Hotel_Bill";
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			System.out.println("All Food Items are: ");
			while(rs.next()) {
				System.out.println("****************************");
				System.out.println("Item Code: "+rs.getInt(1));
				System.out.println("----------------------------");
				System.out.println("Item Name: "+rs.getString(2));
				System.out.println("----------------------------");
				System.out.println("Item Price: "+rs.getDouble(3));	
				System.out.println("***********************************");

			}
		} catch (Exception e) {
			System.out.println("Something Went Wrong!!! Try Again");
		}
		finally {
			//CLOSE ALL JDBC OBJECTS
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
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
	}//End Of showAll

}//End Of Class





