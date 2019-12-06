package com.manthan.shoppingapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.manthan.shoppingapp.beans.ProductInfoBeans;
import com.manthan.shoppingapp.beans.UserInfoBeans;

public class ShoppingDAOImpl implements ShoppingDAO {

	@Override
	public UserInfoBeans authenticate(String emailId, String password) {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		UserInfoBeans beans=null;

		try {
			//Load Driver
			Class.forName("com.mysql.jdbc.Driver");

			//Get Connection
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Flipkart", "root", "root");

			//Execute query
			String query="select * from User_Info where Email=? and password=?";
			pstmt=con.prepareStatement(query);

			pstmt.setString(1, emailId);
			pstmt.setString(2, password);
			//Process result
			rs=pstmt.executeQuery();
			if(rs.next()) {
				beans = new UserInfoBeans();
				beans.setUserID(rs.getInt("User_ID"));
				beans.setUserName(rs.getString("User_Name"));
				beans.setEmailID(rs.getString("Email"));
				beans.setPassword(rs.getString("password"));
			}


		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {

			try {
				if(con!=null) {
					con.close();
				} 
			}
			catch (SQLException e) {
				e.printStackTrace();
			}

			if(pstmt!=null) {
				try {
					pstmt.close();
				}
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
				}
			}
		}

		return beans;
	}//End Of Authenticate method

	@Override
	public boolean register(UserInfoBeans userInfoBeans) {


		Connection conn=null;
		PreparedStatement pstmt=null;
		boolean isAdded=false;
		try {

			Class.forName("com.mysql.jdbc.Driver");

			String dburl="jdbc:mysql://localhost:3306/Flipkart";
			conn=DriverManager.getConnection(dburl,"root","root");

			pstmt=conn.prepareStatement("insert into User_Info values (?,?,?,?)");

			pstmt.setInt(1, userInfoBeans.getUserID());
			pstmt.setString(2, userInfoBeans.getUserName());
			pstmt.setString(3, userInfoBeans.getEmailID());
			pstmt.setString(4, userInfoBeans.getPassword());

			int n=pstmt.executeUpdate();

			if(n>0) {
				isAdded=true;
			}


		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return isAdded;
	}//End Of register method

	@Override
	public ProductInfoBeans searchProduct(int productID) {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		ProductInfoBeans productInfoBeans =new ProductInfoBeans();

		try {
			//LOAD THE DRIVER
			Class.forName("com.mysql.jdbc.Driver");

			//GET CONNECTION VIA DRIVER
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Flipkart");

			//ISSUE SQL QUERY 
			String query = " select * from Product_Info where Product_ID=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, productID);

			rs = pstmt.executeQuery();

			if(rs.next()) {

				productInfoBeans.setProductID(rs.getInt("Product_ID"));
				productInfoBeans.setProductName(rs.getString("Product_Name"));
				productInfoBeans.setProductCost(rs.getDouble("Product_Cost"));
				productInfoBeans.setProductColor(rs.getString("Product_Color"));
				productInfoBeans.setDescription(rs.getString("Description"));
				productInfoBeans.setProductNo(rs.getInt("No_Of_Products"));

			}
		} catch (Exception e) {
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
		return productInfoBeans;
	}//end of searchEmployee
}//End of class







