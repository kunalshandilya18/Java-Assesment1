package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetEmployeeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServletContext servletContext=getServletContext();
		String countryCode=servletContext.getInitParameter("countryCode");
		
		PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h1 style='color:blue'>Employee Details<br></h1>");
		out.print("<h2 style='color:grey'> Pavitra Nag<br><br></h2>");
		out.print("<h3 style='color:red'> bhikhari</h3>");
		
		out.print("<b><h3>ServletContext: </h3></b>"+countryCode);
		
		out.print("</body>");
		out.print("</html>");
	} // end of doGet()
}// end of class
