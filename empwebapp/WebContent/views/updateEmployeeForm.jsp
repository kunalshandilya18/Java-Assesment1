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
<form action="./updateEmployeeServletJsp" method="get">
		
				Employee Id:
				<input type="number" name="empId" required>
				Employee Mobile:
				<input type="number" name="empMobile" required>
		<input type="submit" value="UPDATE EMPLOYEE">
	</form>
<div>
		<% if(msg!=null && !msg.isEmpty()){ %><h3 style="color:red"><%=msg %><% } %></h3>
</div>
</body>
</html>