package com;

class Emp
{
    class Insert
    {
      Insert()
      {     
           System.out.println("Inner class Insert");
       }
       void abc()
      {
           System.out.println(" Insert class abc method");
       }
    }
    class Display
    {
      Display()
      {     
           System.out.println("Inner class Display");
       }
             void xyz()
      {
           System.out.println(" Display class xyz method");
       }
    }
}

 
class Demo26
{
  public static void main(String args[])
  {
      Emp e  = new Emp();
     System.out.println("Hi Demo51");


       Emp.Insert ins = e.new Insert();
       ins.abc();

       Emp.Display dis = e.new Display();
       dis.xyz();
  }
}