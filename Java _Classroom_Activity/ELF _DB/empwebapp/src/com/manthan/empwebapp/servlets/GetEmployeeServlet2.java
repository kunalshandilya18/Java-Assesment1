package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetEmployeeServlet2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String empIdval=req.getParameter("empId");
		PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h1 style=color:Blue>Employee Details for empId "+empIdval+":<h1>");
		out.print("<h3> Name = Naveen</h3>");
		out.print("<h3> Salary = 60000</h3>");
		out.print("<h3> Designation= Software Dev</h3>");
		out.print("</body>");
		out.print("</html>");
	}

}
