<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%! String fname;
	String lname;
	String fullname;
	%>
	<%
	fname = request.getParameter("fname");
	lname = request.getParameter("lname");
	fullname = fname +lname;
	%>
	
	<h1> Hi my fulll Names is <%=fullname %></h1>
</body>
</html>