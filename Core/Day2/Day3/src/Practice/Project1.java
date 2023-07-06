package Practice;

import java.util.Scanner;
import java.util.*;
abstract class Emp
{
    int id;
    String name;
    int age;
    Scanner sc= new Scanner(System.in);
    Emp()
    {
        System.out.print("Enter ID: ");
        id= sc.nextInt();

 

        System.out.print("Enter Name :");
        name= sc.next();

        System.out.print("Enter Age: ");
        age= sc.nextInt();    
    }
    abstract void raisesalary();
    

 

}
class Clerk extends Emp
{
    String desig="CLERK";
    int salary=20000;
    void display()
    {
        System.out.println("===================CLERK===================");
        System.out.println("ID :"+id);
        System.out.println("NAME :"+name);
        System.out.println("Age :"+age);
        System.out.println("Salary:"+salary);
        System.out.println("Designation :"+desig);
        System.out.println("===============================================");
    }
    void raisesalary()
    {
        salary=salary+10000;
    }

}
class Developer extends Emp
{
    String desig="Developer";
    int salary=80000;
    void display()
    {
        System.out.println("=====================DEVELOPER===================");
        System.out.println("ID :"+id);
        System.out.println("NAME :"+name);
        System.out.println("Age :"+age);
        System.out.println("Salary:"+salary);
        System.out.println("Designation :"+desig);
        System.out.println("===============================================");
    }
    void raisesalary()
    {
        salary=salary+10000;
    }

 

}
class Tester extends Emp
{

 

    String desig="Tester";
    int salary=40000;

 

    void display()
    {
        System.out.println("====================TESTER====================");
        System.out.println("ID :"+id);
        System.out.println("NAME :"+name);
        System.out.println("Age :"+age);
        System.out.println("Salary:"+salary);
        System.out.println("Designation :"+desig);
        System.out.println("===============================================");
    }
    void raisesalary()
    {
        salary=salary+10000;
    }
}
class Manager extends Emp
{
    String desig="Manager";
    int salary=900000;

 

    void display()
    {
        System.out.println("================MANAGER===============");
        System.out.println("ID :"+id);
        System.out.println("NAME :"+name);
        System.out.println("Age :"+age);
        System.out.println("Salary:"+salary);
        System.out.println("Designation :"+desig);
        System.out.println("===============================================");
    }
    void raisesalary()
    {
        salary=salary+10000;
    }

 

}
class Project1
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
                c.raisesalary();
                System.out.println("After increment : ");
                c.display();
            }
            else if(ch==2)
            {
                Developer d = new Developer();
                d.display();
                d.raisesalary();
                System.out.println("After increment : ");
                d.display();
            }
            else if(ch==3)
            {
                Tester t = new Tester();
                t.display();
                t.raisesalary();
                System.out.println("After increment : ");
                t.display();
            }
            else if(ch==4)
            {
                Manager m = new Manager();
                m.display();
                m.raisesalary();
                System.out.println("After increment : ");
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
