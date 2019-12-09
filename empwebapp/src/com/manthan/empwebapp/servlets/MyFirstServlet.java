package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet {
	
	public MyFirstServlet() {
		System.out.println("hiii");
	}
	
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		
//		ServletConfig servletConfig=getServletConfig();
//		String message=servletConfig.getInitParameter("message");
//		
//		
//		ServletContext servletContext=getServletContext();
//		String countryCode=servletContext.getInitParameter("countryCode");
//		
//		Date date=new Date();
//		resp.setHeader("refresh", "1");
//		PrintWriter out=resp.getWriter();
//		out.print("<html>");
//		out.print("<body>");
//		out.print("<h1> Current Date & Time: <br>"+date+"</h1>");
//		
//		out.print("<b><h3>ServletConfig: </h3></b>"+message+"<br>");
//		out.print("<b><h3>ServletContext: </h3></b>"+countryCode);
//		
//		out.print("</body>");
//		out.print("</html>");
//
//	}//end of doGet()
}//end of class
