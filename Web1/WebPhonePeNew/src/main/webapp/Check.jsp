<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.sql.*" %>
<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <title>Insert title here</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <style>
    body {
      background-color: grey;
    }

    .container {
      text-align: center;
      margin-top: 100px;
    }

    h4 {
      color: #333;
    }
  </style>
</head>

<body>
  <div class="container">
    <%
    try {
        ServletContext context = getServletContext();

        String driver = context.getInitParameter("driver");
        String url = context.getInitParameter("url");
        String username = context.getInitParameter("username");
        String password = context.getInitParameter("password");

        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, username, password);

        Statement s = con.createStatement();
        ResultSet r = s.executeQuery("select * from bank_data_jsp");

        out.print("<h4>");
        out.print(" id : name : account number : ifsc code : pan card : phone number : address : balance ");

        while (r.next()) {
            out.print(r.getInt(1) + ":" + r.getString(2) + ":" + r.getString(3) + ":" + r.getString(4) + ":"
                    + r.getString(5) + ":" + r.getString(6) + ":" + r.getString(7) + ":" + r.getInt(8));
            out.print("<br>");
        }

        out.print("</h4>");

        out.print("<a href='Index.html' class='btn btn-primary'>Home page</a>");
    } catch (Exception e) {
        out.println("An error occurred: " + e.getMessage());
        e.printStackTrace(new java.io.PrintWriter(out));
    }
    %>
  </div>
</body>

</html>
