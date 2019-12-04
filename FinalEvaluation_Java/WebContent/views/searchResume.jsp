<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: light gray";>
	
	<a href="./upload" style="margin-left: 1000px; font-size: 40px; font-family: fantasy; color: blue";>upload</a>
	<h1 style="margin-left: 405px; font-family: serif">Search Resume</h1>
	<form action="./searchResumeServlet" method="post">
		<input type="text" name="text" style="margin-left: 430px";placeholder="Enter keyword to search"><br>
		<br> <input type="submit" style="margin-left: 450px";name="">
	</form>

</body>

</html>