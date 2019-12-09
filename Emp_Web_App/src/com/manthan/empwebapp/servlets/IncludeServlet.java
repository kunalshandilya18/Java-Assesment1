package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.ldap.Rdn;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/includeServlet")
public class IncludeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h2>Start of IncludeServlet</h2>");
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("./myFirstServlet");
		dispatcher.include(req, resp);
		
		out.print("<h2>Stop of IncludeServlet</h2>");
		out.print("<body>");
		out.print("</html>");
	}
}
