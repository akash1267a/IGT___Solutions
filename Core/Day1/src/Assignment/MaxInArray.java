package Assignment;
import java.util.Arrays;
public class MaxInArray {

	public static void main(String[] args) {
		int[] arr = {1, 4, 2, 5, 67, 3, 6, 56, 6, 88};

        
        Arrays.sort(arr);

        
        int max = arr[arr.length - 1];

        System.out.println("The maximum number is: " + max);
		

	}

}
