package com.manthan.musicplayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MusicDBAdd {

	public void add() {
		Connection con = null;
		PreparedStatement pstmt = null;


		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Song ID: ");
		int songId=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Song Title: ");
		String songTitle=sc.nextLine();
		System.out.println("Enter Artist Name: ");
		String artistName=sc.nextLine();
		System.out.println("Enter Album Name: ");
		String albumName=sc.nextLine();
		System.out.println("Enter Song Location: ");
		String songLocation=sc.nextLine();
		System.out.println("Enter Song Description: ");
		String description=sc.nextLine();




		try {
			//LOAD THE DRIVER
			Class.forName("com.mysql.jdbc.Driver");

			//GET CONNECTION VIA DRIVER
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/musicplayer", "root", "root");

			//ISSUE SQL QUERY 
			String query = " insert into MusicFiles values (?,?,?,?,?,?)";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, songId);
			pstmt.setString(2, songTitle );
			pstmt.setString(3, artistName);
			pstmt.setString(4, albumName);
			pstmt.setString(5, songLocation);
			pstmt.setString(6, description);


			int n = pstmt.executeUpdate();
			if(n>0) {

				System.out.println("Song Added successfully!!!!");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			//CLOSE JDBC OBJECTS

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
		}//end of finally
	}//end of add

}
