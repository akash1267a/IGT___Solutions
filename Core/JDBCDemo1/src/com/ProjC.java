package com;

import java.sql.*;
import java.util.Scanner;

public class DeleteRecord {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt", "root", "1234");
            PreparedStatement pstmt = con.prepareStatement("delete from employee1 where id = ?");
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter ID :");
            int id = sc.nextInt();

            pstmt.setInt(1, id);
            pstmt.execute();
            pstmt.close();
            System.out.println("Record deleted successfully!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Read {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt", "root", "1234");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM employee1");

            while (rs.next()) {
                System.out.println(rs.getInt(1) + ": " + rs.getString(2) + ": " + rs.getInt(3) + ": " +
                        rs.getInt(4) + ": " + rs.getString(5));
            }

            stmt.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Update {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt", "root", "1234");
            PreparedStatement pstmt = con.prepareStatement("UPDATE employee SET Salary = ? WHERE id = ?");
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter ID:");
            int id = sc.nextInt();

            System.out.println("Enter Salary:");
            int salary = sc.nextInt();

            pstmt.setInt(1, salary);
            pstmt.setInt(2, id);
            pstmt.execute();
            pstmt.close();
            System.out.println("Record updated successfully!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class ProjC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt", "root", "1234");
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO employee1 VALUES(?,?,?,?,?)");
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter ID:");
            int id = sc.nextInt();

            System.out.println("Enter Name:");
            String name = sc.next();

            System.out.println("Enter Age:");
            int age = sc.nextInt();

            System.out.println("Enter Salary:");
            int salary = sc.nextInt();

            System.out.println("Enter Designation:");
            String desig = sc.next();

            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setInt(3, age);
            pstmt.setInt(4, salary);
            pstmt.setString(5, desig);
            pstmt.execute();
            pstmt.close();
            System.out.println("Data inserted successfully!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
