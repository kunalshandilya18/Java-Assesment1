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
import com.manthan.shoppingapp.dao.UserDAOImplManager;
@WebServlet("/registerUser")
public class RegisterUser extends HttpServlet{

	private ShoppingDAO dao=UserDAOImplManager.getDaoManager();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session=req.getSession(false);
		if(session!=null){

			//get the form data
			int userID=Integer.parseInt(req.getParameter("userID"));
			String userName=req.getParameter("userName");
			String emailID=req.getParameter("userEmail");
			String password=req.getParameter("userPassword");

			UserInfoBeans userInfoBeans=new UserInfoBeans();

			if(dao.register(userInfoBeans)) {
				req.setAttribute("msg", "You are Successfully Registerd");
			}else {
				req.setAttribute("msg", "You are not Registerd ....Something went wrong!!");
			}
			req.getRequestDispatcher("/register").forward(req, resp);
		}else {
			req.setAttribute("msg", "Please Login Again!! Time out");
			req.getRequestDispatcher("/login").include(req, resp);
		}//end of if-else()

	}// end of doPost()

}//End Of Class
