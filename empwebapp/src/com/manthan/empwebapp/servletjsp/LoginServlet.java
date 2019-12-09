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

@WebServlet("/loginServletJsp")
public class LoginServlet extends HttpServlet {
EmployeeDAO dao=new EmployeeDAOImpl();
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int empId=Integer.parseInt(req.getParameter("empId"));
	String empPassword=(req.getParameter("empPassword"));
	
	EmployeeInfoBeans employeeInfoBeans=dao.authenticateEmployee(empId, empPassword);
	if(employeeInfoBeans!=null) {
		HttpSession session=req.getSession(true);
		session.setAttribute("employeeInfoBean", employeeInfoBeans);
		req.getRequestDispatcher("/homePage").forward(req, resp);
	}else {
		req.setAttribute("invalidMessage", "Invalid id or password");
		req.getRequestDispatcher("/loginForm").forward(req, resp);
	}

}
}
