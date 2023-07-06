package Practice;
import java.util.Scanner;
public class FahrnToDegree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Farenheit");
		int f = sc.nextInt();
		float d = (f-32)*5/9;
		System.out.println("Degree is : "+ d );

	}

}
