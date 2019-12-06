package com.manthan.hotel_billing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HotelBillingTotal {
	
	public void totalPrice() {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			//LOAD THE DRIVER
			Class.forName("com.mysql.jdbc.Driver");

			//GET CONNECTION 
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_DB", "root", "root");

			//ISSUE SQL QUERY 
			String query = " select sum(price) from Hotel_Bill";
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();

			while(rs.next()) {

				System.out.println("Total price of the day : ");
				System.out.println("Rs"+rs.getInt(1));

			}
		} catch (Exception e) {
			e.printStackTrace();
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
					System.out.println("Something Went Wrong!!! Try Again");
				}
			}
		}//End Of Finally
		
	}//End of totalPrice

}//End Of Class
