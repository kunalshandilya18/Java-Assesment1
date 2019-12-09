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
import com.manthan.empwebapp.dao.EmployeeDAO;
import com.manthan.empwebapp.util.EmployeeDAOImplMAanager;

@WebServlet("/addEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {
	private EmployeeDAO dao=EmployeeDAOImplMAanager.getDaoManager();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		HttpSession session=req.getSession(false);
		if(session!=null){
			EmployeeInfoBeans beans=(EmployeeInfoBeans) session.getAttribute("employeeInfoBean");
			
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
			
			PrintWriter out=resp.getWriter();
			out.print("<html>");
			out.print("<body>");
			
			if(dao.addEmployee(employeeInfoBeans)) {
				out.print("<h2>Hii !!"+beans.getEmpName()+" RECORD INSERTED </h2>");
			}else {
				out.print("<h2> SORRY!!"+beans.getEmpName()+" RECORD NOT INSERTED </h2>");
			}
			out.print("</body>");
			out.print("</html>");
		}else {
			req.getRequestDispatcher("./login.html").include(req, resp);
		}//end of if-else()
	
	}// end of doPost()
}// end of class
