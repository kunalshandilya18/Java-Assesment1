<%@page import="com.manthan.empwebapp.beans.EmployeeInfoBeans"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<% String msg=(String) request.getParameter("msg");
	EmployeeInfoBeans employeeInfoBeans =(EmployeeInfoBeans) request.getAttribute("searchedEmployee");
%>
<<jsp:include page="/homePage"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="./searchEmployeeServletJsp" method="get">
		<h2>SEARCH EMPLOYEE</h2>
		Employee ID: <input type="text" name="empId" required>
		<input type="submit">
	</form>
	<div>
		<% if(msg!=null && !msg.isEmpty()){ %><h3 style="color:red"><%=msg %><% } %></h3>
		<% if(employeeInfoBeans!= null){ %>
			<h3>Employee Name:</h3>
			<%=employeeInfoBeans.getEmpName() %><br>
			<h3>Employee Age:</h3>
			<%=employeeInfoBeans.getEmpAge() %><br>
			<h3>Employee Salary:</h3>
			<%=employeeInfoBeans.getEmpSalary() %><br>
			<h3>Employee Designation:</h3>
			<p><%=employeeInfoBeans.getEmpDesignation() %></p><br>
		<% } %>
	</div>
</body>
</html>