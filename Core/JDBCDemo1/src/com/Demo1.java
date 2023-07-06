package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo1 {

	public static void main(String[] args) {
		//java to Database
		//5 steps
		//step 1 load the driver + add the jar file
		//step 2 create the connection
		//step 3 create the statement
		//step 4 is execute the statemnt
		//step 5 is close the connection
		try {
			Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://loacalhoast:3306/igt","root","1234");
Statement stmt  = con.createStatement();
stmt.execute("insert into employee1 values(100,'Abhi',25,5000,'clerk')");
stmt.close();
System.out.println("data  inserted sucessfully.....!");
		
		} catch(Exception e) {
			System.out.println(e);
		}

	}

}
