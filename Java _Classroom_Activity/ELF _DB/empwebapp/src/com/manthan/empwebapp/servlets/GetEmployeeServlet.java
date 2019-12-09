package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetEmployeeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h2 style=color:blue>Employee Details:</h2>");
		out.println("Employee ID = 101 <br>");
		out.println("Employee Name = Sayed <br>");
		out.println("Salary = 90000 <br>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
