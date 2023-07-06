package com;

import java.sql.*;
import java.util.Scanner;

 

public class UpdateRecord {
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

            PreparedStatement pstmt = con.prepareStatement("update employee set Salery = ? where id = ?");
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter ID :");
            int id = sc.nextInt();

       
            System.out.println("Enter Salery");
            int salery = sc.nextInt();


            pstmt.setInt(1,id );
            pstmt.setInt(2,salery );
            
            pstmt.execute();
            pstmt.close();
            System.out.println("data inserted sucessfully...!");
        } catch (Exception e) {
            System.out.println(e);
        }

 

    }

}