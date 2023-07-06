package Practice;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		int rev = 0;
		int num = 121;
		int real_Num = num;
		while(num != 0) {
			int digit = num % 10;
			rev = rev *10 + digit;
			num = num/10;
		}
		System.out.println(rev);
		
		if(real_Num == rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome ");
		}
			
	}
}
	
	


