package Practice;

public class Demo36 {

	public static void main(String[] args) {
		String name = "Akash";
		System.out.println(name.length());
			//name = null; NullPointerException
		System.out.println(name.length());
		
		int arr[] = {0,10,20,30,40};
		
		System.out.println(arr[4]);
								//System.out.println(arr[3]);ArrayIndexOutofBOundsException
		String nm = "100";
		String num = "100A"; //NumberFormatException
		System.out.println(Integer.parseInt(num));
		// FileNOtFoundException
		// INputMismatch Exception
		// SQLException
		
		
	}

}
