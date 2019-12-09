package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.empwebapp.beans.EmployeeInfoBeans;
import com.manthan.empwebapp.dao.EmployeeDAO;
import com.manthan.empwebapp.util.EmployeeDAOImplMAanager;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	EmployeeDAO dao=EmployeeDAOImplMAanager.getDaoManager();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int empId=Integer.parseInt(req.getParameter("empId"));
		String empPassword=req.getParameter("empPassword");

		EmployeeInfoBeans employeeInfoBeans=dao.authenticateEmployee(empId, empPassword);

		PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		if(employeeInfoBeans!=null) {
			//valid credentials
			HttpSession session=req.getSession();
			session.setAttribute("employeeInfoBean",employeeInfoBeans);
			
			
		
			out.print(employeeInfoBeans.getEmpName());
			out.print("<br><a href='./addEmployee.html'>ADD EMPLOYEE</a><br>");
			out.print("<a href='./searchEmployee.html'>SEARCH EMPLOYEE</a><br>");
			out.print("<a href='./updateEmployee.html'>UPDATE EMPLOYEE</a><br>");
			out.print("<a href='./deleteEmployee.html'>DELETE EMPLOYEE</a><br>");
			out.print("<a href='./logoutServlet'>LOGOUT</a>");

		}else {
			out.print("Enter Correct ID and Password");
			req.getRequestDispatcher("./login.html").include(req, resp);
		}
		out.print("</body>");
		out.print("</html>");

	}//end of doPost()
}//end of class
