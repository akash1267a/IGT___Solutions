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

 


public class Welcome3 extends HttpServlet {
    private static final long serialVersionUID = 1L;

 

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        int id = Integer.parseInt(request.getParameter("uid"));
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        int salary = Integer.parseInt(request.getParameter("salary"));
        String design = request.getParameter("design");

 


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
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt", "root", "1234");
//              PreparedStatement pstmt = con.prepareStatement("update employee set Salary=? where id = ?");
//            Class.forName(driver);
//            Connection con = DriverManager.getConnection(url,username, password);

 

            PreparedStatement p = con.prepareStatement("insert into employee values(?, ?, ?, ?, ?)");

 

            p.setInt(1, id);
            p.setString(2, name);
            p.setInt(3, age);
            p.setInt(4, salary);
            p.setString(5, design);

 

            p.execute();
//            p.close();

 

            out.print("<h1>");
            out.print("Id:" + id + "<br>");
            out.print("Name: " + name + "<br>");
            out.print("Age" + age + "<br>");
            out.print("Salary" + salary + "<br>");
            out.print("Designation: " + design + "<br>");
            out.print("</h1>");
            out.print("Inserted");
            out.print("<a href='index.html' >Home</a>");
        } catch(Exception e) {

 

            System.out.println(e);
        }    

 

    }

 

}