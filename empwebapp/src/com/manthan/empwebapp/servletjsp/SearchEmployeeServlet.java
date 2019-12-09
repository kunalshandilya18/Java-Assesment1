package com.manthan.empwebapp.servletjsp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.empwebapp.beans.EmployeeInfoBeans;
import com.manthan.empwebapp.dao.EmployeeDAO;
import com.manthan.empwebapp.dao.EmployeeDAOImpl;

@WebServlet("/searchEmployeeServletJsp")
public class SearchEmployeeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		
		if(session!=null){
			int empId=Integer.parseInt(req.getParameter("empId"));
			EmployeeDAO dao=new EmployeeDAOImpl();
			EmployeeInfoBeans employeeInfoBeans=dao.searchEmployee(empId);
			
			if(employeeInfoBeans!=null) {
				req.setAttribute("searchedEmployee", employeeInfoBeans);
			}else {
				req.setAttribute("msg", "Employee Id not found");
			}
			req.getRequestDispatcher("./searchEmployeeForm").forward(req, resp);
			
		}else {
			req.setAttribute("msg", "Please!!! Login First");
			req.getRequestDispatcher("/loginForm").include(req, resp);
		}
	}//end of doGet()
}//end of class
