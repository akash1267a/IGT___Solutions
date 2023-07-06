package Practice;

import java.util.Scanner;

class A {

	int id;
	String name;
	int age;
	float salery;
	String desg;
	
	A() {
		
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter ID: ");
		id = sc.nextInt();

		System.out.print("Enter Name: ");
		name = sc.next();
		
		System.out.print("Enter Age: ");
		age = sc.nextInt();

		System.out.print("Enter Salery: ");
		salery = sc.nextFloat();

		System.out.print("Enter Designation: ");
		desg = sc.next();
	}

	void display() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Salery: " + salery);
		System.out.println("Designation: " + desg);
	}
}


class Demo4 {

	public static void main(String[] args) {

		System.out.println("Class Demo");
		
		A a = new A();
		a.display();
	}
}