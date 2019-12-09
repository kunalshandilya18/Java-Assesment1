package com.manthan.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.manthan.beans.UserInfoBean;

public class UserDAOImpl implements UserInfoDAO{

	@Override
	public boolean register(String name, String password, int age, String gender) throws SQLException {
		
		
		
		Connection con=null;
		PreparedStatement pstmt=null;

		boolean isAdded = false;
		UserInfoBean bean=new UserInfoBean();

		try {
			//Load Driver
			Class.forName("com.mysql.jdbc.Driver");


			//Get Connection
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db","root","root");

			//Issue SQL Query
			String query="insert into employee_info values (?,?,?,?)";
			pstmt=con.prepareStatement(query);

			int n=pstmt.executeUpdate();

			pstmt.setString(1,bean.getName());
			pstmt.setString(1, bean.getPassword());
			pstmt.setInt(3,bean.getAge());
			pstmt.setString(4, bean.getGender());
			
			//Process Execution
			if(n>0) {
				isAdded=true;
			}

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		
		finally {
			if(con!=null) {
				con.close();
			}
			
			if(pstmt!=null) {
				pstmt.close();
			}
			
		}
		return isAdded;

	}

	@Override
	public UserInfoBean login(String name, String Password) throws SQLException {
		
		Connection con=null;
		PreparedStatement pstmt=null;

		boolean isAdded = false;
		UserInfoBean bean=new UserInfoBean();

		try {
			//Load Driver
			Class.forName("com.mysql.jdbc.Driver");


			//Get Connection
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db","root","root");

			//Issue SQL Query
			String query="insert into employee_info values (?,?,?,?)";
			pstmt=con.prepareStatement(query);

			int n=pstmt.executeUpdate();

			pstmt.setString(1,bean.getName());
			pstmt.setString(1, bean.getPassword());
			pstmt.setInt(3,bean.getAge());
			pstmt.setString(4, bean.getGender());
			
			//Process Execution
			if(n>0) {
				isAdded=true;
			}

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		
		finally {
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		

		
		
		return null;
	}

	@Override
	public UserInfoBean authenticate(int empId, String empPassword) {
		
		
		return null;
	}

}
