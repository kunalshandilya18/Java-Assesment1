<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%!
    	int a=100;
    	public int getA(){
    		return a;
    	}
    	
    	public void setA(int a){
    		this.a=a;
    	}
    	String name="Kunal";
    	public String getName(){
    		return name;
    	}
    	public String getName(String givenName){
    		return givenName;
    	}
    	public void setName(){
    		this.name=name;
    	}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>HELLO USER</h2>
	a1=<%=a %><br>
	a2=<%=getA() %><br>
	
	Name1=<%=name %> <br>
	Name2=<%=getName() %><br>
	Name3=<%=getName("ABC") %><br>
	
	<% for(int i=0;i<=5;i++){ %>
	<%=getName() %><br>
	<%} %>
	
	
	
	
</body>
<jsp:include page="/date.html"></jsp:include>
</html>