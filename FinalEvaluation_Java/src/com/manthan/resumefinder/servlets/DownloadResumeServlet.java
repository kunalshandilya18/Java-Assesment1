package com.manthan.resumefinder.servlets;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/downloadServlet")
public class DownloadResumeServlet extends HttpServlet {
	
//	 private static final int BUFSIZE = 4096;
//	  private String path;

//	  public void init() {
//	      // the file data.xls is under web application folder
//
//	      path = getServletContext().getRealPath("C:\\Users\\CBT\\Desktop\\newfile") + File.separator;
//	  }

	  protected void doGet(HttpServletRequest request,
	            HttpServletResponse response) throws ServletException, IOException {
		  response.setContentType("text/html");  
		  PrintWriter out = response.getWriter();  
		  String filename = (String)request.getParameter("url");   
		  String filepath = "C:\\Users\\CBT\\Desktop\\newfile\\";   
		  response.setContentType("APPLICATION/PDF");   
		  response.setHeader("Content-Disposition","attachment; filename=\"" + filename + "\"");   
		    
		  FileInputStream fileInputStream = new FileInputStream(filepath + filename);  
		              
		  int i;   
		  while ((i=fileInputStream.read()) != -1) {  
		  out.write(i);   
		  }   
		  fileInputStream.close();   
		  out.close();   
	    }//End of do get

}//End of class
