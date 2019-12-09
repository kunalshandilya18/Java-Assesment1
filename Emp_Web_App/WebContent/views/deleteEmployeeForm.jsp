<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<% String msg=(String) request.getAttribute("msg");%>
<jsp:include page="/homePage"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="./deleteEmployeeServletJsp" method="get">
		
				Employee Id:
				<input type="number" name="empId" required>
		<input type="submit" value="DELETE EMPLOYEE">
</form>
<div>
		<% if(msg!=null && !msg.isEmpty()){ %><h3 style="color:red"><%=msg %><% } %></h3>
	</div>
</body>
</html>