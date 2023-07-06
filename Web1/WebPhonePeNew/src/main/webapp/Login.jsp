<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html>
<html>

 

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

 

<body>

 

    <%

    try {

        String name = request.getParameter("uname");
        String pass = request.getParameter("upass");

        if(name.equalsIgnoreCase("Akash") && pass.equalsIgnoreCase("Akash@123"))  {

            out.print("<h1>Logged in</h1>");
            RequestDispatcher rd = request.getRequestDispatcher("Index.html");
            rd.forward(request, response);
        } else {

            RequestDispatcher rd = request.getRequestDispatcher("Login.html");
            out.print("<p>Please try once again</p>");
            rd.include(request, response);
        }
    } catch (Exception e) {
        out.println("An error occurred: " + e.getMessage());
        e.printStackTrace(new java.io.PrintWriter(out));
    }

    %>

 

</body>

 

</html>