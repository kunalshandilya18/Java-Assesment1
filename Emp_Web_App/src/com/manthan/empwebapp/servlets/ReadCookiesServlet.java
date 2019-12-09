package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/readCookiesServlet")
public class ReadCookiesServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Cookie[] cookies=req.getCookies();
	 
	PrintWriter out=resp.getWriter();
	out.print("<html>");
	out.print("<body>");
	for (Cookie cookie : cookies) {
		out.print("<h2>Cookie Name: "+cookie.getName()+"</h2>");
		out.print("<h2>Cookie Value: "+cookie.getValue()+"</h2>");
	}
	out.print("</body>");
	out.print("<html>");
}
}
