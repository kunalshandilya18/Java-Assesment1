<%@page import="com.manthan.empwebapp.beans.EmployeeInfoBeans"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<% String msg=(String) request.getAttribute("msg");
%>
<jsp:include page="/homePage"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>	
	
	<form action="./addEmployeeServletJsp" method="post">
		<table>
			<tr>
				<td>Employee Id:</td>
				<td><input type="number" name="empId" required></td>
			</tr>
			<tr>
				<td>Employee Name:</td>
				<td><input type="text" name="empName" required></td>
			</tr>
			<tr>
				<td>Employee Age:</td>
				<td><input type="number" name="empAge" required></td>
			</tr>
			<tr>
				<td>Employee Designation:</td>
				<td><input type="text" name="empDesignation" required></td>
			</tr>
			<tr>
				<td>Employee Salary:</td>
				<td><input type="text" name="empSalary" required></td>
			</tr>
			<tr>
				<td>Employee Mobile:</td>
				<td><input type="number" name="empMobile" required></td>
			</tr>
			<tr>
				<td>Employee Password:</td>
				<td><input type="password" name="empPassword" required></td>
			</tr>
			<tr>
				<td><input type="submit" value="ADD EMPLOYEE"></td>
			</tr>
		</table>

	</form>
	
	<div>
		<% if(msg!=null && !msg.isEmpty()){ %><h3 style="color:red"><%=msg %><% } %></h3>
	</div>
	
</body>
</html>