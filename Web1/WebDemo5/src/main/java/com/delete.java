package com;

 

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

 

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 

public class delete extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("uid"));
        PrintWriter out = response.getWriter();

 


        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt", "root", "1234");
            PreparedStatement pstmt = con.prepareStatement("delete from employee where id = ?");

            pstmt.setInt(1, id);

            pstmt.execute();
//            pstmt.close();
            out.print("<h1>");
            out.print("Deleted");
            out.print("<a href='index.html' >Home</a>");
            out.print("</h1>");


        } catch(Exception e) {
            System.out.println(e);
        }
    }
}