package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/forwardServlet")
public class ForwardServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h2>Start of ForwardServlet</h2>");//we will not get the resp because we forwarding to servlet2
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("./myFirstServlet");
		dispatcher.forward(req, resp);
		
		out.print("<h2>Stop of ForwardServlet</h2>");
		out.print("<body>");
		out.print("</html>");
	}//end of doGet()
}//end of class
