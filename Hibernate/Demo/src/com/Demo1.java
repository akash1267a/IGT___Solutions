package com;
import java.util.*;
import java.io.*;

public class Demo1 {

	public static void main(String[] args) {
		
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Eneter Id?");
			int id = Integer.parseInt(br.readLine());
			
			System.out.println("Eneter First namen");
			String fname = br.readLine();
			
			System.out.println("Eneter Lst namen");
			String lname = br.readLine();
			
			System.out.println("ID is : "+ id);
			System.out.println("First name is : "+ fname);
			System.out.println("Last name  is : "+ lname);
				
			
		}
		catch(Exception e){
		}
		
	}

}
