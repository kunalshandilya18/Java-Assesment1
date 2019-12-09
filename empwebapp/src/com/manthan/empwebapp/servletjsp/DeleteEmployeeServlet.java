package com.manthan.empwebapp.servletjsp;

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

@WebServlet("/deleteEmployeeServletJsp")
public class DeleteEmployeeServlet extends HttpServlet {
	private EmployeeDAO dao=EmployeeDAOImplMAanager.getDaoManager();
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	HttpSession session=req.getSession(false);
	if(session!=null){
		int empId=Integer.parseInt(req.getParameter("empId"));
		
		
		boolean isUpdated=dao.deleteEmployee(empId);
		
		
		if(isUpdated == true) {
			req.setAttribute("msg", "Employee Deleted");
			
		}else{
			req.setAttribute("msg", "Employee not deleted");
		}
		req.getRequestDispatcher("./deleteEmployeeForm").forward(req, resp);
	}//end of if-else()
	else {
		req.setAttribute("msg", "Please!!! Login First");
		req.getRequestDispatcher("/loginForm").include(req, resp);
	}//end of if-else() session
}//end of doGet()
}//end of class
