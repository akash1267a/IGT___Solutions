package Practice;

import java.util.Scanner;

public class Demo30 {

	public static void main(String[] args) {
		{
			m1();
		}
		static void m1()
		{
			m2();
			System.out.println("M1 method");
		}
		static void m2()
		{
			m3();
			System.out.println("M2 method");
			
		}
		static void m3()
		{
			System.out.println("Enter The A value: ");
			Scanner sc = new Scanner(System.in);
			try
			{
				System.out.println("Enter the A value :");
				int a =sc.nextInt();
				
				System.out.println("Enter the Bvaluee : ");
				int b = sc.nextInt();
				int c = a/b;
				System.out.println("Result is : " + c);
				
			}
			catch(ArtithmaticException ae)
			{
				System.out.println("Hello bro we can't divide anything by /0");
				
			}
			catch(InputMismatchException ime)
			{
				System.out.println("Hy boss please  enter the number only...!");
			}
		}
	}	

}
