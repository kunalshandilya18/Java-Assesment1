package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.empwebapp.dao.EmployeeDAO;
import com.manthan.empwebapp.util.EmployeeDAOImplMAanager;

@WebServlet("/deleteEmployeeServlet")
public class DeleteEmployeeServlet extends HttpServlet {
	private EmployeeDAO dao=EmployeeDAOImplMAanager.getDaoManager();
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	PrintWriter out=resp.getWriter();
	out.print("<html>");
	out.print("<body>");
	HttpSession session=req.getSession(false);
	if(session!=null){
		int empId=Integer.parseInt(req.getParameter("empId"));
		
		
		boolean isUpdated=dao.deleteEmployee(empId);
		
		
		if(isUpdated == true) {
			out.print("RECORD DELETED");
			
		}else{
			out.print("RECORD NOT DELETED!!!! TRY AGAIN");
			req.getRequestDispatcher("./loginServlet").include(req, resp);
		}
		
	}//end of if-else()
	else {
			out.print("<h2>LOGIN FIRST!!!</h2>");
		req.getRequestDispatcher("./login.html").include(req, resp);
	}//end of if-else() session
	out.print("<html>");
	out.print("<body>");
}//end of doGet()
}//end of class
