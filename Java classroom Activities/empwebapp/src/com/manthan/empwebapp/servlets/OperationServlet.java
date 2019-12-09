package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.empwebapp.beans.EmployeeInfoBeans;

@WebServlet("/operationServlet")
public class OperationServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	HttpSession session=req.getSession(false);
	if (session!=null) {
		
		PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		EmployeeInfoBeans employeeInfoBeans= (EmployeeInfoBeans) session.getAttribute("employeeInfoBean");
		out.print("<br> WELCOME "+employeeInfoBeans.getEmpName()+"<br>");
		out.print("<br><a href='./addEmployee.html'></a><br>");
		out.print("<a href='./searchEmployee.html'>SEARCH EMPLOYEE</a><br>");
		out.print("<a href='./updateEmployee.html'>UPDATE EMPLOYEE</a><br>");
		out.print("<a href='./deleteEmployee.html'>DELETE EMPLOYEE</a><br>");
		out.print("<a href='./logoutServlet'>LOGOUT</a>");
		out.print("</body>");
		out.print("</html>");
	} else {
		req.getRequestDispatcher("./login.html").include(req, resp);
	}
}
}
