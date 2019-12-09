package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/searchEmployeeServlet")
public class SerachEmployeeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String empIdVal = req.getParameter("empId");
		int empId = Integer.parseInt(empIdVal);

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			
			//LOAD THE DRIVER
			Class.forName("com.mysql.jdbc.Driver");
			
			//GET CONNECTION VIA DRIVER
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db", "root", "root");
			
			//ISSUE SQL QUERY 
			String query = " select * from employee_info where emp_id=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, empId);

			rs = pstmt.executeQuery();
			
			//PROCESS THE RESULT
			PrintWriter out = resp.getWriter();
			out.print("<html>");
			out.print("<body>");
			if (rs.next()) {

				out.print("<h1 style=color:black>Employee ID: " + empId + "<br></h1>");
				out.print("Name: " + rs.getString("emp_name")+"<br>");
				out.print("Age: " + rs.getInt("age")+"<br>");
				out.print("Salary: " + rs.getDouble("salary")+"<br>");
				out.print("Designation: " + rs.getString("designation")+"<br>");
				out.print("Mobile: " + rs.getLong("mobile"));

			} else {
				out.print("<h2>Sorry!! NOT FOUND....</h2>");
			}
			out.print("</html>");
			out.print("</body>");
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
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
		} // end of finally
	}// end of doGet()
} // end of class
