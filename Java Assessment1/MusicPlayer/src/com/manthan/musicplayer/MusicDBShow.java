package com.manthan.musicplayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MusicDBShow {
	public void show() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			//LOAD THE DRIVER
			Class.forName("com.mysql.jdbc.Driver");

			//GET CONNECTION VIA DRIVER
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/musicplayer", "root", "root");

			//ISSUE SQL QUERY 
			String query = " select * from MusicFiles";
			stmt = con.createStatement();


			rs = stmt.executeQuery(query);
			System.out.println();
			System.out.println("**********The Songs Are:**********");
			while(rs.next()) {

				System.out.println();
				System.out.print("Song Id: "+rs.getInt(1)+"\t");
				System.out.print("Song Title: "+rs.getString(2)+"\t");
				System.out.print("Artist Name: "+rs.getString(3)+"\t");
				System.out.print("Album Name: "+rs.getString(4)+"\t");
				System.out.print("Song Location: "+rs.getString(5)+"\t");
				System.out.print("Description: "+rs.getString(6)+"\t");
				System.out.println();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			//CLOSE JDBC OBJECTS
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
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
		}//end of finally
	}//end of show


}
