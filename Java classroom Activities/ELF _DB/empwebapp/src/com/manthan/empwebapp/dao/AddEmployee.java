package com.manthan.empwebapp.dao;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manthan.empwebapp.beans.EmployeeInfoBean;
import com.manthan.empwebapp.util.EmpDAOImplManager;
@WebServlet("/addEmployee")

public class AddEmployee extends HttpServlet {
	private static EmployeeDAO dao=EmpDAOImplManager.getDaoInstance();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int empId=Integer.parseInt(req.getParameter("empId"));
		String empName=req.getParameter("empName");
		int age=Integer.parseInt(req.getParameter("age"));
		double salary=Double.parseDouble(req.getParameter("salary"));
		String designation=req.getParameter("designation");
		long mobileNo=Long.parseLong(req.getParameter("mobileNo"));
		
		EmployeeInfoBean bean=new EmployeeInfoBean();
		bean.setEmpId(empId);
		bean.setEmpName(empName);
		bean.setAge(age);
		bean.setSalary(salary);
		bean.setDesignaton(designation);
		bean.setMobileNo(mobileNo);
		
		PrintWriter out=resp.getWriter();
		
		
		out.print("<html>");
		out.print("<body>");
		if(dao.addEmployee(bean)){
			out.print("Records Updated");
		}
		else {
			out.print("Records not updated");
		}
		out.print("</body>");
		out.print("</html>");
	}//End of dopost
	

}//End of class
