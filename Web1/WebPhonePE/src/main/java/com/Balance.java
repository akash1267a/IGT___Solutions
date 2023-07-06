package com;

 

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

 

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 

@WebServlet("/ReadBalance")
public class Balance extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub

        PrintWriter out = response.getWriter();

        try {

 

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "1234");

            Statement s = con.createStatement();
            ResultSet r = s.executeQuery("select * from bank_data");

            out.print("<h4>");

 

            while(r.next()) {
                out.println(r.getInt(1) + ":" + r.getString(2) + ":" + r.getInt(3) + ":" + r.getInt(4) + ":" + r.getInt(5) + ":" + r.getInt(6) + ":" + r.getInt(7));
                out.print("<br>");
            }

            out.print("/<h4>");

            out.print("<a href='Index.html'>HOME PAGE</a>");

        } catch(Exception e) {

            System.out.println(e);
        }    

    }

}