package Assighnemts;

class dupli {

	public static void main(String[] args) {
		
		String s = "This is a string";
		char[] c = s.toCharArray();
		int cou; 

		for(int i=0; i<s.length()-1; i++) {
			
			cou = 1;
			for(int j=i+1; j<s.length(); j++) {
	
				if(c[i] == c[j] && c[i] != ' ' && c[i] != '0') {
		
					cou+=1;
					c[j] = '0';
				}
			}
	
			if(cou > 1)  {
				System.out.println(c[i] + " " + cou);
			}
		}
	}
}