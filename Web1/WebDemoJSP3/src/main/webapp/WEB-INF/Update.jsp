<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html>
<html>

 

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

 

<body>
<%

    int id = Integer.parseInt(request.getParameter("uid"));
    int salary = Integer.parseInt(request.getParameter("usalary"));

    try {

 

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt", "root", "1234");

        PreparedStatement p = con.prepareStatement("update employee set salery = ? where id = ?");

        p.setInt(1, id);
        p.setInt(2, salary);

        p.execute();
        p.close();

        out.print("<h1>");
        out.print("Updated");
        out.print("</h1>");
    } catch(Exception e) {

        System.out.println(e);
    }    

    %>
</body>
</html>