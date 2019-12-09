<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%!
    	public void jspInit(){
    	System.out.println("Inside jspInit()....");
    }
    	public void jspDestroy(){
    		System.out.println("Inside Destroy.....");
    	}
    %>
    <%
    	System.out.println("Inside service()....!!");
    	//java Code to generate dynamic date
    	Date dateRef=new Date();
    %>
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>	
	<h2>Current Date And Time</h2>
	<h3> <%=dateRef %> </h3>
</body>
</html>