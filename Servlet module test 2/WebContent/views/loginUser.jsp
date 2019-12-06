<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	String msg = (String) request.getAttribute("msg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		if (msg != null && !msg.isEmpty()) {
	%>
	<%=msg%>
	<%
		}
	%>
	<fieldset>
		<legend>Student Login</legend>

		<form action="./loginServlet" method="post">
			Email ID<input type="email" name="userEmail"><br>
			<br> Password<input type="password" name="userPassword"><br>
			<br> <input type="submit" name=""><br>
			<br> <a href="./register">New User? Register</a>
		</form>
</body>
</html>