package com.manthan.hotel_billing;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelBillingAddOrder {

	public void addOrder() {
		int foodChoice=1;
		List<Double> billItem=new ArrayList<Double>();
		double sumBill=0;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		Scanner sc=new Scanner(System.in);


		while(foodChoice!=0)
		{
			System.out.println("Enter the food codes to order");
			System.out.println("Press 0 to exit");
			foodChoice = sc.nextInt();
			//LOAD THE DRIVER
			try {
				Class.forName("com.mysql.jdbc.Driver");
				
				//GET CONNECTION 
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_DB", "root", "root");
				
				//ISSUE SQL QUERY 
				String query= "select * from Hotel_Bill where Item_code=?";
				pstmt =con.prepareStatement(query);
				pstmt.setInt(1,foodChoice);
				rs = pstmt.executeQuery();
				if(rs.next()) {

					billItem.add(rs.getDouble("Price"));
				}else {
					System.out.println("Item not present");
				}

			} catch(Exception e) {
				System.out.println("Sorry! Something went wrong");
			}
			finally
			{
				//CLOSE ALL JDBC OBJECTS
				try
				{
					if(rs!=null)
						rs.close();
					if(pstmt!=null)
						pstmt.close();
					if(con!=null)
						con.close();
				}
				catch(Exception e) {
					e.printStackTrace();
				}


			}

		}

		for(int i = 0; i < billItem.size(); i++) {
			sumBill += billItem.get(i);
		}
		System.out.println("Bill :"+sumBill);
	}//End Of addOrder

}//End Of class



