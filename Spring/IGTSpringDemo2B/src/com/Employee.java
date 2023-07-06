package com;

 

public class Employee {

 

    private int id;
    private String name;
    private int age;
    private int salary;
    private String desig;
	public Employee(int id, String name, int age, int salary, String desig) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.desig = desig;
	}
    

void display() {
    System.out.println("ID :"+id);
    System.out.println("Name :"+name);
    System.out.println("Age :"+age);
    System.out.println("Salary :"+salary);
    System.out.println("Designation :"+desig);
}
}