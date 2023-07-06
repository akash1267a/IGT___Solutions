package Assignment;

import java.util.Scanner;
class Clerk
{
	int id;
	String name;
	String desig="CLERK";
	int salary=20000;
	int age;
	Scanner sc= new Scanner(System.in);
	Clerk()
	{
		System.out.print("Enter ID: ");
		id= sc.nextInt();

		System.out.print("Enter Name :");
		name= sc.next();
	
		System.out.print("Enter Age: ");
		age= sc.nextInt();	
	}
	void display()
	{
		System.out.println("========================");
		System.out.println("ID :"+id);
		System.out.println("NAME :"+name);
		System.out.println("Age :"+age);
		System.out.println("Salary:"+salary);
		System.out.println("Designation :"+desig);
	}

}
class Developer
{
	int id;
	String name;
	String desig="Deverloper";
	int salary=80000;
	int age;
	Scanner sc= new Scanner(System.in);
	Developer()
	{
		System.out.print("Enter ID: ");
		id= sc.nextInt();

		System.out.print("Enter Name :");
		name= sc.next();
	
		System.out.print("Enter Age: ");
		age= sc.nextInt();
	}
	void display()
	{
		System.out.println("========================");
		System.out.println("ID :"+id);
		System.out.println("NAME :"+name);
		System.out.println("Age :"+age);
		System.out.println("Salary:"+salary);
		System.out.println("Designation :"+desig);
	}

}
class Tester
{
	int id;
	String name;
	String desig="Tester";
	int salary=40000;
	int age;
	Scanner sc= new Scanner(System.in);
	Tester()
	{
		System.out.print("Enter ID: ");
		id= sc.nextInt();

		System.out.print("Enter Name :");
		name= sc.next();
	
		System.out.print("Enter Age: ");
		age= sc.nextInt();	
	}
	void display()
	{
		System.out.println("========================");
		System.out.println("ID :"+id);
		System.out.println("NAME :"+name);
		System.out.println("Age :"+age);
		System.out.println("Salary:"+salary);
		System.out.println("Designation :"+desig);
	}

}
class Manager
{
	int id;
	String name;
	String desig="Manager";
	int salary=900000;
	int age;
	Scanner sc= new Scanner(System.in);
	Manager()
	{
		System.out.print("Enter ID: ");
		id= sc.nextInt();

		System.out.print("Enter Name :");
		name= sc.next();
	
		System.out.print("Enter Age: ");
		age= sc.nextInt();
	}
	void display()
	{
		System.out.println("========================");
		System.out.println("ID :"+id);
		System.out.println("NAME :"+name);
		System.out.println("Age :"+age);
		System.out.println("Salary:"+salary);
		System.out.println("Designation :"+desig);
	}

}
class Demo10 
{
	public static void main(String args[])
	{
		int ch=0;
		Scanner sc= new Scanner(System.in);
		do{
			System.out.println("1 ) Clerk ");
			System.out.println("2 ) Developer");
			System.out.println("3 ) Tester ");
			System.out.println("4 ) Manager");
			System.out.println("5 ) Exit");
			System.out.print("Enter the Chioice :");
			ch=sc.nextInt();
			if(ch==1)
			{
				Clerk c= new Clerk();	
				c.display();
			}
			else if(ch==2)
			{
				Developer d = new Developer();
				d.display();
			}
			else if(ch==3)
			{
				Tester t = new Tester();
				t.display();
			}
			else if(ch==4)
			{
				Manager m = new Manager();
				m.display();
			}
			else if(ch==5)
			{
				System.out.println("Thank you");
				System.exit(0);
			}
			
		}while(ch<=4);
	}
}