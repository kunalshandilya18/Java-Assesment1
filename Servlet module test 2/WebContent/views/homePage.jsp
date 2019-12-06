<%@page import="com.manthan.shoppingapp.beans.UserInfoBeans"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<% UserInfoBeans employeeInfoBeans=(UserInfoBeans) session.getAttribute("userInfoBean"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="/searchProduct" method="post"></form>

<a href="./search">Search Product</a>
<a href="">Order Product</a>
<a href="">See Order History</a>
<a href="">Logoutt</a>

</body>
</html>