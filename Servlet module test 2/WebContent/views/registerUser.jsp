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

	<form action="./registerUser" method="post">
		User ID<input type="number" name="userID"><br> <br>
		Name<input type="text" name="userName"><br> <br>
		Email ID<input type="email" name="userEmail"><br> <br>
		Password<input type="Password" name="userPassword"><br> <br>
		<input type="submit" name=""><br> <br> 
		<a href="./login">Login User</a>
	</form>
</body>
</html>