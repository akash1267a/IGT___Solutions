
package com;
import java.io.*;

class demo4{

	public static void main(String[] args) {
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			File dir1=new File("abc");
			dir1.mkdir();
			
			File dir2= new File("xyz");
			dir2.mkdir();
			
			File f=new File(dir2,"atoz.txt");
			
			if(f.exists()) {
				System.out.println("File, Exsists ...!");
				System.out.println("Please Enter Some other file name");
				String fname=br.readLine();
				f = new File(dir2,fname);
				f.createNewFile();
			}
			else
			{
				f.createNewFile();
			}
			PrintWriter pw= new PrintWriter(new FileOutputStream(f,true));
			  System.out.println("Enter ID !");
	            String id=br.readLine();

	            System.out.println("Enter NAME !");
	            String name=br.readLine();

	 

	            System.out.println("Enter AGE  !");
	            String age=br.readLine();

	 

	            System.out.println("Enter SALAEY !");
	            String salary=br.readLine();

	 

	            System.out.println("Enter DESIG  !");
	            String desig=br.readLine();

	 

	            pw.println(id + " "+name + " "+age + " "+salary+ " "+desig );
	            pw.println(" ");
			
		}
		catch (Exception e)
		{
		}
		

	}

}
