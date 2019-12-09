<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%!
	public void jspInit(){
	//System.out.println("inside jspInit()...");
	}
	public void jspDestroy(){
		//System.out.println("Inside Destroy()...");
	}
%>

<%
	//java code to generate dynamic date
	System.out.println("inside service()...");
	Date dateRef = new Date();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>current date and time</h1><br>
<h3> <%= dateRef%> </h3>
</body>
</html>