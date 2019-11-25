package com.manthan.musicplayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import java.util.Random;


public class MusicPlay {

	public String playSong(int songId) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String songName=null;

		try {
			//LOAD THE DRIVER
			Class.forName("com.mysql.jdbc.Driver");

			//GET CONNECTION VIA DRIVER
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/musicplayer", "root", "root");

			//ISSUE SQL QUERY 
			String query = " select * from MusicFiles where Song_ID=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, songId);

			rs = pstmt.executeQuery();

			while(rs.next()) {

				songName=rs.getString("Song_Title");

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
		return songName;
	}//end of playSong


	public void playAllSong() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			//LOAD THE DRIVER
			Class.forName("com.mysql.jdbc.Driver");

			//GET CONNECTION VIA DRIVER
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/musicplayer", "root", "root");

			//ISSUE SQL QUERY 
			String query = " select * from MusicFiles;";
			stmt = con.createStatement();


			rs = stmt.executeQuery(query);
			while(rs.next()) {				
				System.out.println("Playing "+rs.getString(2)+"........");

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
	}//end of playAllSongs


	public void playAllSongRandom() {
		Connection con = null;
		Statement stmt1 = null;
		Statement stmt3 = null;
		ResultSet rs1 = null;
		ResultSet rs3 = null;

		Random random=new Random();

		int songCount=0;

		try {
			//LOAD THE DRIVER
			Class.forName("com.mysql.jdbc.Driver");

			//GET CONNECTION VIA DRIVER
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/musicplayer", "root", "root");

			//ISSUE SQL QUERY 
			String query = " select * from MusicFiles;";
			stmt1 = con.createStatement();

			rs1 = stmt1.executeQuery(query);
			
			while(rs1.next()) {

				songCount++;

			}
			int arr[]=new int[songCount];
			
			//System.out.println(songCount);
			for(int i=0;i<songCount;i++){
				arr[i]=(random.nextInt((songCount-1)+1))+1;

			}
			
			System.out.println("----------------------");
			for (int i=0;i<arr.length;i++) {
				stmt3=con.createStatement();
				rs3 = stmt3.executeQuery("select * from MusicFiles where Song_ID="+arr[i]);
				while( rs3.next()) {
					System.out.println("Playing...."+rs3.getString(2));
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			//CLOSE JDBC OBJECTS
			if (rs1 != null) {
				try {
					rs1.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (rs3 != null) {
				try {
					rs3.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stmt1 != null) {
				try {
					stmt1.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stmt3 != null) {
				try {
					stmt3.close();
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
	}//end of searchSong




}// end of class
