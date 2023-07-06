package com;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
class Emp
{
	static void insert()
	{
		try {		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/igt","root", "root");
			PreparedStatement pstmt=con.prepareStatement("insert into employee1 values(?,?,?,?,?)");
			Scanner sc = new Scanner(System.in);
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
			pstmt.close();
			System.out.println("data inserted sucessfully...!");
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	}
	static void display()
	{
		try {		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/igt","root", "root");

			Statement stmt=con.createStatement();
			ResultSet rs =stmt.executeQuery("Select * from employee1");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+":"+rs.getString(2)+": "+rs.getInt(3)+": "+rs.getInt(4)+" : "+rs.getString(5));
			}
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		
	}
	static void update()
	{
		try {		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/igt","root", "root");
			PreparedStatement pstmt=con.prepareStatement("update employee set Salary= ? where id= ? ");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter ID ");
			int id= sc.nextInt();
			
			System.out.println("Enter Salary ");
			int salary= sc.nextInt();
			
			pstmt.setInt(1, salary);
			pstmt.setInt(2, id);
			
			pstmt.execute();
			pstmt.close();
			System.out.println("data Updated sucessfully...!");
		} 
		catch (Exception e) {
			System.out.println(e);
		}

		
	}
	static void delete()
	{
		try {		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/igt","root", "root");

			PreparedStatement pstmt=con.prepareStatement("delete from employee where id= ? ");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter ID ");
			int id= sc.nextInt();
			
			pstmt.setInt(1, id);
			
			pstmt.execute();
			pstmt.close();
			System.out.println("data Deleted  sucessfully...!");
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		
	}
	
}

public class Project {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch=0;
		do {
			System.out.println("Enter choise ");
			 System.out.println("1) ADD RECORD ");
			 System.out.println("2) Display Record ");
			 System.out.println("3) UPDATE");
			 System.out.println("4) DELETE");
			 ch=sc.nextInt();
			 if(ch==1) {
				Emp.insert();
			 }
			 else if(ch==2) {
				 Emp.display();
			 }	
			 else if(ch==3) {
					Emp.update();
			 }
			 else if(ch==4) {
					Emp.delete();
			 }
			
		}while(ch<5);

	}

}