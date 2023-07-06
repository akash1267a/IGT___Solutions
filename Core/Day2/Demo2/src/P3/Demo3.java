package P3;

public class Demo3 {

	public static void main(String[] args) {
		int arr[] = {0,10,20,30,40,50,60};
		//int arr[] = {0,10,20,30,40,50,"ABC"};only hommogenious allowed
	
		for(int i = 0;i<arr.length;i++) {
		System.out.println(arr[i]);
			
		}
		System.out.println('===========');
		for(int x:arr) {
			System.out.println(x)
		}
		System.out.println("=================");
		
		int[] arr1 = new int[5];
		arr1[0] = 0;
		arr1[1] = 100;
		arr1[2] = 200;
		arr1[3] = 300;
		arr1[4] = 400;
		//arr1[5] = 500; size is also a fixed....!
		
		for(int i = 0 ; i<arr1.length; i++)
		{
			System.out.println(arr[i]));
		}
	
	
	
	}

} 
