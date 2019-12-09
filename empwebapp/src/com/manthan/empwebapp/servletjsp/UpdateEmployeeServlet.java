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

@WebServlet("/updateEmployeeServletJsp")
public class UpdateEmployeeServlet extends HttpServlet {

	private EmployeeDAO dao=EmployeeDAOImplMAanager.getDaoManager();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		HttpSession session=req.getSession(false);
		if(session!=null){
			int empId=Integer.parseInt(req.getParameter("empId"));
			Long empMobile=Long.parseLong(req.getParameter("empMobile"));

			boolean isUpdated=dao.updateEmployee(empId, empMobile);


			if(isUpdated == true) {
				req.setAttribute("msg", "Employee Updated");

			}else{
				req.setAttribute("msg", "Employee not updated!");

			}
			req.getRequestDispatcher("./updateEmployeeForm").forward(req, resp);
		}//end of if-else()
		else {
			req.setAttribute("msg", "Please!!! Login First");
			req.getRequestDispatcher("/loginForm").include(req, resp);
		}//end of if-else() session
		out.print("<html>");
		out.print("<body>");
	}//end of doGet
}//end of class
