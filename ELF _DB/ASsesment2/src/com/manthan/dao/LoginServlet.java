package com.manthan.dao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.beans.UserInfoBean;
@SuppressWarnings("serial")
@WebServlet("/loginServletJsp")
public class LoginServlet extends HttpServlet {
	UserInfoDAO dao=new UserDAOImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int empId=Integer.parseInt(req.getParameter("name"));
		String empPassword=(req.getParameter("password"));

		UserInfoBean beans=dao.authenticate(empId, empPassword);
		if(beans!=null) {
			HttpSession session=req.getSession(true);
			session.setAttribute("UserInfoBean", beans);
			req.getRequestDispatcher("/homePage").forward(req, resp);
		}else {
			req.setAttribute("invalidMessage", "Invalid id or password");
			req.getRequestDispatcher("/loginForm").forward(req, resp);
		}

	}
}
