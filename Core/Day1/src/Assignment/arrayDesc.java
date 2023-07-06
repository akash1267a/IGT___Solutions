package Assignment;

class arrayDesc {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 4, 2, 5, 67, 3, 6, 3, 56, 6, 88};
		int temp;

		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
 				}
			}
		}

		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}