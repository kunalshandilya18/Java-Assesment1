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
import com.manthan.empwebapp.util.EmpDAOImplManager;
@WebServlet("/deleteEmployee")
public class DeleteEmployee extends HttpServlet {
	private static EmployeeDAO dao=EmpDAOImplManager.getDaoInstance();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		HttpSession session=req.getSession(false);
		if(session!=null) {
			int empId=Integer.parseInt(req.getParameter("empId"));
			
			boolean isDealeted=dao.deleteEmployee(empId);
			if(isDealeted==true) {
				out.print("Record Deleted");
			}
			else {
				out.print("Record not deleted!!! Try Again");
				req.getRequestDispatcher("./loginServlet").include(req, resp);
				
			}
		}
		else {
			out.print("<h2>Login First</h2>");
			req.getRequestDispatcher("./login.html").include(req, resp);
		}
		out.print("</body>");
		out.print("</html>");
	}

}
