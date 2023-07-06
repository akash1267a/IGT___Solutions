<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html>
<html>

 

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

 

<body>

 

    <%

    int id = Integer.parseInt(request.getParameter("id"));
    int amt = Integer.parseInt(request.getParameter("amt"));

    try {

        ServletContext context = getServletContext();

        String driver = context.getInitParameter("driver");
        String url = context.getInitParameter("url");
        String username = context.getInitParameter("username");
        String password = context.getInitParameter("password");

        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, username, password);

        PreparedStatement p = con.prepareStatement("update bank_data_jsp set balance = balance+? where id = ?");

        p.setInt(1, amt);
        p.setInt(2, id);

        p.execute();
        p.close();

        out.print("<h1>");
        out.print("Deposited Amount: " + amt + "<br>");

 

        out.print("<a href='Index.html'>Home page</a>");

    } catch (Exception e) {
        out.println("An error occurred: " + e.getMessage());
        e.printStackTrace(new java.io.PrintWriter(out));
    }

    %>

 


</body>

 

</html>