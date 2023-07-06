package Assighnemts;

class StringLen {

	public static void main(String[] args) {
		
		String s = "This is a string";
		int c = 0;

		for(int i=0; i<s.length(); i++) {
		
			if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
				c+=1;
			}	
		}

		System.out.println(c);
	}
}