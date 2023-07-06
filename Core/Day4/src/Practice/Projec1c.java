package Practice;

import java.util.*;
interface I
{
    public abstract void cab();
}
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
final class Clerk extends Emp implements I
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
    {}
    public void cab()
    {
    }
}
final class Developer extends Emp  implements I
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
    public void cab()
    {
    }
}
final class Tester extends Emp  implements I
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
    public void cab()
    {
    }
}
final  class Manager extends Emp  implements I
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
    public void cab()
    {
    }
}
class Project1c 
{
    public static void main(String args[])
    {
    try
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
                System.exit(0);
            }

        }while(ch<=4);
    }
    catch(InputMismatchException i)
    {
        System.out.println("HY boss please enter only numbr...!");
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    finally
    {
        System.out.println("Thank You ");
    }    
    }
}