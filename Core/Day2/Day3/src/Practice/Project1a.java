package Practice;

import java.util.Scanner;
abstract class Emp 
{
    int id;
    String name;
    int age;
    int salary;
    String desig;
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
    void display()
    {
        System.out.println("========================");
        System.out.println("ID :"+id);
        System.out.println("NAME :"+name);
        System.out.println("Age :"+age);
        System.out.println("Salary:"+salary);
        System.out.println("Designation :"+desig);
    }
    abstract void raisesalary();
    abstract void bonus();

}
final class Clerk extends Emp
{
    Clerk()
    {
        desig="Clerk";
        salary=20000;    
    }
    void raisesalary()
    {
        salary=salary+50000;
    }
    void bonus()
    {
    }
}
final class Developer extends Emp
{
    Developer()
    {
         desig="Developer";
         salary=40000;
    }
    void raisesalary()
    {
        salary=salary+10000;
    }
    void bonus()
    {

    }
}
final class Tester extends Emp
{
    Tester()
    {
        desig="Tester";
         salary=30000;
    }
    void raisesalary()
    {
        salary=salary+80000;
    }    
    void bonus()
    {

    }
}
final  class Manager extends Emp
{    
    Manager()
    {
         desig="Manager";
         salary=80000;
    }
    void raisesalary()
    {
        salary=salary+15000;
    }
    void bonus()
    {

    }
}
class Project1a 
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
                System.out.println("After Raising the salary is :");
                c.display();
            }
            else if(ch==2)
            {
                Developer d = new Developer();
                d.display();
                d.raisesalary();            
                System.out.println("After Raising the salary is :");
                d.display();
            }
            else if(ch==3)
            {
                Tester t = new Tester();
                t.display();
                t.raisesalary();
                System.out.println("After Raising the salary is :");
                t.display();
            }
            else if(ch==4)
            {
                Manager m = new Manager();
                m.display();
                m.raisesalary();
                System.out.println("After Raising the salary is :");
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