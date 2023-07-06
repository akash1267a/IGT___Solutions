package Assignment;

public class MaxThree {

	public static void main(String[] args) {
        int num1 = 12;
        int num2 = 67;
        int num3 = 24;
        int max;

        if (num1 >= num2 && num1 >= num3) {
            max = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            max = num2;
        } else {
            max = num3;
        }

        System.out.println("The maximum number is: " + max);

	}

}
