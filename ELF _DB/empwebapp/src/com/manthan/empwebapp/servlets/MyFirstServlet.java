package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet {
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		Date date=new Date();
		resp.setHeader("refresh", "1");
		
		ServletConfig config=getServletConfig();
		String msg=config.getInitParameter("message");
		
		ServletContext context=getServletContext();
		String code=context.getInitParameter("countrycode");
		
		PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>Current System Date and Time <br>"+date+"</h1><br>");
		out.print("<h2>"+msg+"</h2><br>");
		out.print("<h2> Country Code is "+ code +"<h2>");
		out.print("</body>");
		out.print("</html>");
	}

		
		

}//End of class
