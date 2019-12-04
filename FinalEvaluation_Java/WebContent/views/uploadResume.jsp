<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%
	String message = (String) request.getAttribute("message");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: light gray";>
	
		<a href="./search"
			style="margin-left: 1000px; font-size: 40px; font-family: fantasy; color: blue";>search</a>
		<h1 style="margin-left: 405px; font-family: serif">Upload Resume</h1>
		<form  action="./uploadResume" method="post"
			enctype="multipart/form-data">
			<input style="margin-left: 405px" ; type="file" name="select file"><br><br>
			<input style="margin-left: 450px" ; type="submit" name="">
		</form>

	
	<div>
		<%
			if (message != null && !message.isEmpty()) {
		%><h3 style="color: green;margin-left:405px";><%=message%>
			<%
				}
			%>
		</h3>
	</div>
</body>
</html>