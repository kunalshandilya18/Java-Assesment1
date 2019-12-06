package com.manthan.shoppingapp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.shoppingapp.beans.UserInfoBeans;
import com.manthan.shoppingapp.dao.ShoppingDAO;
import com.manthan.shoppingapp.dao.ShoppingDAOImpl;
@WebServlet("/loginServlet")
public class LoginUser extends HttpServlet{
	ShoppingDAO dao=new ShoppingDAOImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session=req.getSession(false);

		if(session!=null) {

			String emailID=req.getParameter("userEmail");
			String password=req.getParameter("userPassword");
			try {
				UserInfoBeans beans=dao.authenticate(emailID, password);
				if(beans!=null) {
					req.getRequestDispatcher("./home").forward(req, resp);
				}

				else {
					req.setAttribute("msg","Invalid Credentials" );
					req.getRequestDispatcher("./login").forward(req, resp);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}



	}

}
