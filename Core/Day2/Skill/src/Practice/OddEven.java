package Practice;
import java.util.Scanner;


public class OddEven {
	public static void main(String[] args){
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a NUmber");
			int Num= sc.nextInt();
			if(Num%2==0) {
				System.out.println("Number is Even");
			}
			else {
				System.out.println("Numbe is ODD");
			}
			
			
		}
}
