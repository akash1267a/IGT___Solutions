package Assighnment;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello, World!";
        char[] resultarray = str.toCharArray();
        for (int i = resultarray.length - 1; i >= 0; i--)
        	System.out.print(resultarray[i]);
    }    
  
}