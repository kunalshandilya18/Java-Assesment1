<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	List<String> searchResults = (ArrayList) request.getAttribute("results");
	String message = (String) request.getAttribute("message");
	List<String> email = (ArrayList) request.getAttribute("emails");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body >
	<%
		if (message != null) {
	%>
	<%=message%>
	<%
		}
	%>
	<%
		if (searchResults != null && email != null) {
	%>

	<table border class="table table-dark">
		<tr >
			<th scope="col">File Name</th>
			<th scope="col">Download</th>
			<th scope="col">Email_ID</th>
		</tr>

		<%
			for (int i = 0; i < searchResults.size(); i++) {
		%>
		<tr>
			<td  scope="row">><%=searchResults.get(i)
			%></td>

			<td><a href="./downloadServlet?url=<%= searchResults.get(i)%>">Click
					to Download</a></td>

			<td><%=
				email.get(i)
			%></td>
		</tr>

		<%
			}
		%>
	</table>

	<%} %>


</body>
</html>