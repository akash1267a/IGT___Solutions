package com;

 

import java.io.IOException;
import java.io.PrintWriter;

 

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

 

public class DepositServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;


 

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int account = Integer.parseInt(request.getParameter("account"));
        int amount = Integer.parseInt(request.getParameter("amount"));
        PrintWriter out = response.getWriter();

 


        try {
        	Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "1234");
            PreparedStatement pstmt = con.prepareStatement("update bank_data set bal=bal + ? where account = ?");

            pstmt.setInt(1, amount);
            pstmt.setInt(2, account);

            pstmt.execute();
//            pstmt.close();
            out.print("<h1>");
            out.print("account:" + account + "<br>");
            out.print("Deposit" + amount + "<br>");
            out.print("</h1>");
            out.print("Deposited");
            out.print("<a href='Index.html' >Home</a>");


        } catch(Exception e) {
            System.out.println(e);
        }
    }

 


}