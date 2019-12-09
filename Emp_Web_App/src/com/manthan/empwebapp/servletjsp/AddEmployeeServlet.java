package com.manthan.empwebapp.servletjsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.empwebapp.beans.EmployeeInfoBeans;
import com.manthan.empwebapp.dao.EmployeeDAO;
import com.manthan.empwebapp.util.EmployeeDAOImplMAanager;

@WebServlet("/addEmployeeServletJsp")
public class AddEmployeeServlet extends HttpServlet {
	private EmployeeDAO dao=EmployeeDAOImplMAanager.getDaoManager();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		HttpSession session=req.getSession(false);
		if(session!=null){
			//EmployeeInfoBeans beans=(EmployeeInfoBeans) req.getAttribute("employeeInfoBean");
			
			//get the form data
			int empId=Integer.parseInt(req.getParameter("empId"));
			String empName=(req.getParameter("empName"));
			int empAge=Integer.parseInt(req.getParameter("empAge"));
			double empSalary=Double.parseDouble(req.getParameter("empSalary"));
			Long empMobile=Long.parseLong(req.getParameter("empMobile"));
			String empDesignation=(req.getParameter("empDesignation"));
			
			EmployeeInfoBeans employeeInfoBeans=new EmployeeInfoBeans();
			employeeInfoBeans.setEmpId(empId);
			employeeInfoBeans.setEmpAge(empAge);
			employeeInfoBeans.setEmpDesignation(empDesignation);
			employeeInfoBeans.setEmpMobile(empMobile);
			employeeInfoBeans.setEmpName(empName);
			employeeInfoBeans.setEmpSalary(empSalary);
			
			
			
			if(dao.addEmployee(employeeInfoBeans)) {
				req.setAttribute("msg", "Employee Added");
			}else {
				req.setAttribute("msg", "Employee not added");
			}
			req.getRequestDispatcher("./addEmployeeForm").forward(req, resp);
		}else {
			req.setAttribute("msg", "Please!!! Login First");
			req.getRequestDispatcher("/loginForm").include(req, resp);
		}//end of if-else()
	
	}// end of doPost()
}// end of class
