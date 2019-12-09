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
		String empIdValue=req.getParameter("empId");
		PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h1 style=color:black>Employee Details "+empIdValue+"<br></h1>");
		out.print("<h2 style='color:grey'> Pavitra Nag<br><br></h2>");
		out.print("<h3 style='color:red'> SD</h3>");
		out.print("</body>");
		out.print("</html>");
	}
}
