package com;

public class Employee {
	
	private int id;
	private String name;
	private String Salary;
	private String Desig;
	public Employee(int id, String name, String salary, String desig) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
		Desig = desig;
	}
	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(Salary);
		System.out.println(Desig);
	}
	

}
