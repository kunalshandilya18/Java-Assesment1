package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manthan.empwebapp.beans.EmployeeInfoBeans;
import com.manthan.empwebapp.dao.EmployeeDAO;
import com.manthan.empwebapp.util.EmployeeDAOImplMAanager;


@WebServlet("/searchEmployeeServlet2")
public class SearchEmployeeServlet2 extends HttpServlet {

	private EmployeeDAO dao=EmployeeDAOImplMAanager.getDaoManager();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String empIdVal = req.getParameter("empId");
		int empId = Integer.parseInt(empIdVal);

		EmployeeInfoBeans employeeInfoBeans =dao.searchEmployee(empId);
		PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		if (employeeInfoBeans!=null) {
			out.print("<h1 style=color:black>Employee ID: " + empId + "<br></h1>");
			out.print("Name: " + employeeInfoBeans.getEmpName()+"<br>");
			out.print("Age: " + employeeInfoBeans.getEmpAge()+"<br>");
			out.print("Salary: " + employeeInfoBeans.getEmpSalary()+"<br>");
			out.print("Salary: " + employeeInfoBeans.getEmpDesignation()+"<br>");
			out.print("Designation: " + employeeInfoBeans.getEmpMobile()+"<br>");
		}
		out.print("</html>");
		out.print("</body>");
		out.close();
	}
}
