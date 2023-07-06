package Assighnment;

public class Palindrome {
    public static void main(String[] args) {
        String str = "madam";
        
        char[] resultarray = str.toCharArray();
        for (int i = resultarray.length - 1; i >= 0; i--)
        	System.out.print(resultarray[i]);
        if(str.equals(resultarray)) {
        	System.out.println("Palindrome");}
        else {
        	System.out.println("Not_Palindrome");
        }
        
     

    }    
    
      
}