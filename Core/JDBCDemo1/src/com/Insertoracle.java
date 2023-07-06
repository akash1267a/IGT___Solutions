package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Insertoracle {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","tiger");

			
			PreparedStatement pstmt=con.prepareStatement("insert into employee values(?,?,?,?,?)");
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter ID ");
			int id=sc.nextInt();
			
			System.out.println("Enter Name :");
			String name=sc.next();
			
			System.out.println("Enter AGE  ");
			int age=sc.nextInt();
			
			System.out.println("Enter Salary ");
			int salary=sc.nextInt();
			
			
			System.out.println("Enter Designation ");
			String desig=sc.next();
			
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, age);
			pstmt.setInt(4, salary);
			pstmt.setString(5, desig);

			pstmt.execute();
			pstmt.close();
			con.close();
			System.out.println("Data Inserted successfully....!");
			}
			catch (Exception e) {
				System.out.println(e);
			}
	}

}