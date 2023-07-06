package P3;

public class Demo2 {

	public static void main(String[] args) {
		String s = new String("Ramesh"); // we canget modify . its immuateble
		System.out.println(s);
		
		s.concat("Kukmar");
		System.out.println(s);
		//its a thread safe: one onle there will execute 
		
		StringBuffer sb = new StringBuffer("Pravin");
		sb.append("KUMar");
		System.out.println(sb); //mutable ,wwe can change or modify
		
		sb.insert(0,"MR");
		System.out.println(sb);
		
		sb.delete(0, 3);
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		//thread not safe
		StringBuilder sb1 = new StringBuilder("Charan");
		sb1.append("Kumar");
		System.out.println(sb1);
		

	}

}
