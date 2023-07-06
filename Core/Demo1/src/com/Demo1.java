package com;
class A{
A()
{
     System.out.println("A class COnstructor");
}
void abc() {
    System.out.println("Hi abc method");
}    

}
public class Demo1 {
public static void main(String args[])
{
  A a = new A();
  a.abc();
}
}