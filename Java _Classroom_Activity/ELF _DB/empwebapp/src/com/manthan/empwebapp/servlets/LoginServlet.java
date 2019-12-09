package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.empwebapp.beans.EmployeeInfoBean;
import com.manthan.empwebapp.dao.EmployeeDAO;
import com.manthan.empwebapp.util.EmpDAOImplManager;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	EmployeeDAO dao= EmpDAOImplManager.getDaoInstance();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int empIdVal=Integer.parseInt(req.getParameter("empId"));
		String passwordVal=req.getParameter("password");
		EmployeeInfoBean bean=dao.authenticate(empIdVal, passwordVal);
		PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		if(bean!=null) {
			//valid credentials
			HttpSession session=req.getSession(true);
			session.setAttribute("bean", bean);
			
			out.print("<h2>Welcome "+bean.getEmpName() +"</h2>");
			out.print("<a href= './addEmployee.html'>Add New Employee</a><br>");
			out.print("<a href= './searchEmployee.html'>Search Employee</a><br>");
			out.print("<a href= './updateEmployee.html'>Update Employee</a><br>");
			out.print("<a href='./deleteEmployee.html'>Delete Employee</a><br>");
			
		}
		else {
			//Invalid credentials
			out.print("Invalid Credentials!!!<br>");
			req.getRequestDispatcher("/.Login.html").include(req, resp);
		}
		out.print("</body>");
		out.print("</html>");
	}//End of do post

}//End of class
