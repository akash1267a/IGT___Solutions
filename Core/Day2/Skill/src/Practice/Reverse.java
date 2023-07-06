package Practice;
import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		int rev = 0;
		int num = 1267;
		while(num != 0) {
			int digit = num % 10;
			rev = rev *10 + digit;
			num = num/10;
		}
		System.out.println(rev);
	}

}
