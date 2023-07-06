package Practice;

import java.util.Scanner;

class Demo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter ID: ");
		int id = sc.nextInt();

		System.out.print("Enter Name: ");
		String name = sc.next();
		
		System.out.print("Enter Age: ");
		int age = sc.nextInt();

		System.out.print("Enter Salery: ");
		float salery = sc.nextFloat();

		System.out.print("Enter Designation: ");
		String desg = sc.next();

		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Salery: " + salery);
		System.out.println("Designation: " + desg);
	}
}