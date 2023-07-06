package com;

import java.sql.*;
import java.util.Scanner;

 

public class InsertRecord {
    public static void main(String[] args) {    
        // java to Database 
        // 5 steps
        //step  1 load the driver  + add the jar file 
        // step 2 create the connection 
        // create the statement 
        // step 4 is execute the statmente 
        // step 5 is close the connection 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/igt","root", "1234");
//            Statement stmt=con.createStatement();
//            stmt.execute("insert into employee values(789,'Akash',22,45000,'')");

            PreparedStatement pstmt = con.prepareStatement("insert into employee1 values(?,?,?,?,?)");
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter ID :");
            int id = sc.nextInt();

            System.out.println("Enter Name :");
            String name = sc.next();

            System.out.println("Enter Age");
            int age = sc.nextInt();

            System.out.println("Enter Salary");
            int salary = sc.nextInt();

            System.out.println("Enter Designation");
            String desig = sc.next();

            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setInt(3, age);
            pstmt.setInt(4, salary);
            pstmt.setString(5, desig);
            pstmt.execute();
            pstmt.close();
            System.out.println("data inserted sucessfully...!");
        } catch (Exception e) {
            System.out.println(e);
        }

 

    }

}