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
	<h2>SCECOND JSP FILE</h2>
	
	a1= <%= a %><br>
	a2= <%= getA() %><br>
	
	name1= <%= name %><br>
	name2= <%= getName() %><br>
	name3= <%= getName("ABC") %><br>
	
</body>
</html>
<jsp:include page="/date.html"></jsp:include>