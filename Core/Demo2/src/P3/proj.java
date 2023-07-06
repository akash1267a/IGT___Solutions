package P3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
abstract class A
{
	String name;
	int age;
	int salary;
	String designation;
	Scanner sc=new Scanner(System.in);
	A()
	{
		try
		{	
			Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/igt","root", "1234");
			
            PreparedStatement pstmt = con.prepareStatement("insert into employee1 values(?,?)");
		
		System.out.println("Enter the Name:");
		name=sc.next();

		System.out.println("Enter Age:");
		age=sc.nextInt();		
		
		
		pstmt.setString(1, name);
		 pstmt.setInt(2, age);
         
		  Statement stmt = con.createStatement();
	        ResultSet rs = stmt.executeQuery("Select * from employee1");

	 

	        while(rs.next()) {
	            System.out.println(rs.getInt(1)+": "+rs.getString(2)+": "+rs.getInt(3)+": "+rs.getInt(4)+": "+rs.getString(5));
		
	            
		}	}
	catch(Exception e)
			{
			System.out.println(e);
			}
		
	}
	
	

 	public void display()
	{	 
		System.out.println("\nNAME:"+name);	
 		System.out.println("AGE:" +age);
		System.out.println("SALARY:" +salary);	
		System.out.println("DESIGNATION:"+designation); 		
	}
	public abstract void riseSalary();
}
final class Clerk extends A{
	public Clerk(){
		salary=10000;
		designation="Clerk";
	}
	public void riseSalary(){
		salary=salary+5000;
		System.out.println("incremented Salary for clerk:"+salary);	
	}
}
final class Programmer extends A{
	public Programmer(){
		salary=15000;
		designation="Programmer";
	}
	public void riseSalary(){
		salary=salary+10000;
		System.out.println("incremented Salary for Programmer:"+salary);
		
		
	}
}
final class Manager extends A{
	public Manager(){
		salary=20000;
		designation="Manager";
	}
	public void riseSalary(){
		salary=salary+15000;
		System.out.println("incremented Salary for Manager:"+salary);
	}
}

public class proj
{
	public static void main(String args[])
	{	
		int ch1=0,ch2=0;
//		ArrayList<A> list=new ArrayList<A>();
		LinkedList<A> list= new LinkedList<>();
		do{
		System.out.println("--------------------------------");
		System.out.println("1.creat");
		System.out.println("2.Display");
		System.out.println("3.RiseSalary");
		System.out.println("4.Exit");
		System.out.println("--------------------------------");
		System.out.println("Enter your Choice: ");
		Scanner sc1=new Scanner(System.in);	
		

//		execute and correct the program 
		
		ch1=sc1.nextInt();
		if(ch1==1){
			 do{ 
				System.out.println("--------------------------------");
				System.out.println("1.Clerk");
				System.out.println("2.Programer");
				System.out.println("3.Manager");
				System.out.println("4.Exit");
				System.out.println("--------------------------------");
				System.out.println("Enter your Choice: ");
				Scanner sc2=new Scanner(System.in);
				ch2=sc2.nextInt();
				switch(ch2){
						case 1:
						list.add(new Clerk());
						break;
						case 2:
						list.add(new Programmer());
						break;
						case 3:
						list.add(new Manager());	
						break;
					   }
				}while(ch2!=4);
			}
			if(ch1==2){
				Iterator i=list.iterator();	
				while(i.hasNext())
					{
					A x=(A) i.next();
					x.display();
					}
			
				}
			if(ch1==3){
				Iterator i=list.iterator();	
				while(i.hasNext())
					{
					A x=(A) i.next();
					x.riseSalary();
					}
			
				}
				
			}while(ch1!=4);
	}
}