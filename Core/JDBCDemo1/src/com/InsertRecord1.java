package com;
import java.sql.*;
import java.util.Scanner;
public class InsertRecord1 {
	public static void main(String[] args) {
		try {		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/igt","root", "1234");
//			Statement stmt=con.createStatement();
//			stmt.execute("insert into employee values(200,'Bharath',35,60000,'Developer')");
			PreparedStatement pstmt=con.prepareStatement("insert into employee1 values(?,?,?,?,?)");
			Scanner sc = new Scanner(System.in);
			System.out.println("Ho wmay Employees ypu want to add ? ");
			int no= sc.nextInt();
			for(int i=0;i<no;i++)
			{
				System.out.println("Enter ID ");
				int id= sc.nextInt();
				
				System.out.println("Enter Name :");
				String name= sc.next();
				
				System.out.println("Enter Age ");
				int age= sc.nextInt();
				
				System.out.println("Enter Salary ");
				int salary= sc.nextInt();
				System.out.println("Enter Desig :");
				String desig= sc.next();
				
				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.setInt(3, age);
				pstmt.setInt(4, salary);
				pstmt.setString(5, desig);
				pstmt.execute();
				
				System.out.println("data inserted sucessfully...!");
			}
			pstmt.close();
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}
}