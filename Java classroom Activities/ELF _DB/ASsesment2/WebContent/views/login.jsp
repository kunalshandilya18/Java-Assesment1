<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<% String msg=(String)request.getAttribute("invalidMessage"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% if(msg!=null) { %>
<%= msg %>
<% } %>
<fieldset>
<legend>User Login</legend>
<form action="./loginServletJsp" method="post">

Id:<input type="number" name="user_name"/><br> 
Password:<input	type="password" name="password"/><br> 

<input type="submit" value="submit" />
</form>
</fieldset>
</body>
</html>

