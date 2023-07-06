package com;

import java.sql.*;
import java.util.Scanner;

 

public class ProjectD {
    public static void main(String[] args) {    
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt","root", "1234");

            PreparedStatement pstmtInsert = con.prepareStatement("INSERT INTO employee1 VALUES(?,?,?,?)");

            Scanner sc = new Scanner(System.in);

            int choice = 0;
            do {
                System.out.println("Choose an option:");
                System.out.println("1) CREATE");
                System.out.println("2) READ");
                System.out.println("3) UPDATE");
                System.out.println("4) DELETE");
                System.out.println("5) EXIT");

                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter ID:");
                        int id = sc.nextInt();

                        System.out.println("Enter Name:");
                        String name = sc.next();

                        System.out.println("Enter Age:");
                        int age = sc.nextInt();

                        

                        System.out.println("Choose Designation:");
                        System.out.println("1) CLERK");
                        System.out.println("2) Developer");
                        System.out.println("3) Tester");
                        System.out.println("4) Manager");
                        System.out.println("5) Exit");

                        int designationChoice = sc.nextInt();
                        String designation = "";

                        switch (designationChoice) {
                            case 1:
                                designation = "CLERK";
                                int Salary = 15000;
                                break;
                            case 2:
                                designation = "Developer";
                                int Salary = 35000;
                                break;
                            case 3:
                                designation = "Tester";
                                break;
                            case 4:
                                designation = "Manager";
                                break;
                            case 5:
                                break;
                            default:
                                System.out.println("Invalid choice. Exiting...");
                                choice = 5; // Exit the loop and program
                                break;
                        }

                        if (choice != 5) {
                            pstmtInsert.setInt(1, id);
                            pstmtInsert.setString(2, name);
                            pstmtInsert.setInt(3, age);
                            pstmtInsert.setInt(4, salary);
                            pstmtInsert.setString(5, designation);
                            pstmtInsert.execute();
                            System.out.println("Data inserted successfully!");
                        }

                        break;

                    case 2:
                        Statement stmt = con.createStatement();
                        ResultSet rs = stmt.executeQuery("SELECT * FROM employee1");

 

                        while (rs.next()) {
                            System.out.println(rs.getInt(1) + ": " + rs.getString(2) + ": " + rs.getInt(3) + ": " + rs.getInt(4) + ": " + rs.getString(5));
                        }
                        break;

                    case 3:
                        PreparedStatement pstmtUpdate = con.prepareStatement("UPDATE employee1 SET salary = ? WHERE id = ?");
                        Scanner uc = new Scanner(System.in);

                        System.out.println("Enter ID:");
                        int idu = uc.nextInt();

                        System.out.println("Enter Salary:");
                        int salaryu = uc.nextInt();

                        pstmtUpdate.setInt(1, salaryu);
                        pstmtUpdate.setInt(2, idu);
                        pstmtUpdate.executeUpdate();
                        pstmtUpdate.close();
                        System.out.println("Data Updated Successfully!");
                        break;

                    case 4:
                        PreparedStatement pstmtDelete = con.prepareStatement("DELETE FROM employee1 WHERE id = ?");
                        Scanner dc = new Scanner(System.in);

                        System.out.println("Enter ID:");
                        int idd = dc.nextInt();

                        pstmtDelete.setInt(1, idd);
                        pstmtDelete.executeUpdate();
                        pstmtDelete.close();
                        System.out.println("Data Deleted Successfully!");
                        break;

                    case 5:    
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please choose a valid option.");
                        break;
                }

            } while (choice != 5);

            pstmtInsert.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}