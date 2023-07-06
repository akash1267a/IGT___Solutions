package com;

 

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

 

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 


public class CreateServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

 

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        int id = Integer.parseInt(request.getParameter("uid"));
        String name = request.getParameter("name");
        int account = Integer.parseInt(request.getParameter("account"));
        int ifsc = Integer.parseInt(request.getParameter("ifsc"));
        int adhar = Integer.parseInt(request.getParameter("adhar"));
        int phone = Integer.parseInt(request.getParameter("phone"));
        int bal = Integer.parseInt(request.getParameter("bal"));

 


        PrintWriter out = response.getWriter();

 

        try {

//            ServletConfig config=getServletConfig();  
//            String driver=config.getInitParameter("driver");  
//            String url=config.getInitParameter("url");  
//            String username=config.getInitParameter("username");  
//            String password=config.getInitParameter("password");  

//            ServletContext config=getServletContext();  
//            String driver=config.getInitParameter("driver");  
//            String url=config.getInitParameter("url");  
//            String username=config.getInitParameter("username");  
//            String password=config.getInitParameter("password");  

 
        	   Class.forName("com.mysql.jdbc.Driver");
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "1234");
//              PreparedStatement pstmt = con.prepareStatement("update employee set Salary=? where id = ?");
//            Class.forName(driver);
//            Connection con = DriverManager.getConnection(url,username, password);

 

            PreparedStatement p = con.prepareStatement("insert into bank_data values(?, ?, ?, ?, ?, ?, ?)");

 

            p.setInt(1, id);
            p.setString(2, name);
            p.setInt(3, account);
            p.setInt(4, ifsc);
            p.setInt(5, adhar);
            p.setInt(6, phone);
            p.setInt(7, bal);

 

            p.execute();
//            p.close();

 

            out.print("<h1>");
            out.print("Id:" + id + "<br>");
            out.print("Name: " + name + "<br>");
            out.print("account" + account + "<br>");
            out.print("ifsc" + ifsc + "<br>");
            out.print("adhar: " + adhar + "<br>");
            out.print("phone: " + phone + "<br>");
            out.print("balance: " + bal + "<br>");
            
            
            
            out.print("</h1>");
            out.print("Inserted");
            out.print("<a href='Index.html' >Home</a>");
        } catch(Exception e) {

 

            System.out.println(e);
        }    

 

    }

 

}