package com.manthan.shoppingapp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.shoppingapp.beans.ProductInfoBeans;
import com.manthan.shoppingapp.beans.UserInfoBeans;
import com.manthan.shoppingapp.dao.ShoppingDAO;
import com.manthan.shoppingapp.dao.ShoppingDAOImpl;

public class SearchProductServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		
		if(session!=null){
			int productID=Integer.parseInt(req.getParameter("ProductID"));
			ShoppingDAO dao=new ShoppingDAOImpl();
			ProductInfoBeans productInfoBeans=dao.searchProduct(productID);
			
			if(productInfoBeans!=null) {
				req.setAttribute("product", productInfoBeans);
			}else {
				req.setAttribute("msg", "Product Id not found");
			}
			req.getRequestDispatcher("./search").forward(req, resp);
			
		}else {
			req.setAttribute("msg", "Please!!! Login Again");
			req.getRequestDispatcher("/search").include(req, resp);
		}
	}//end of doGet()

}
