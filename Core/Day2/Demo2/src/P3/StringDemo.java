package P3;

public class StringDemo {

	public static void main(String[] args) {
		String name = "SuREsh iS a TraINe";
		String s = new String("Ramesh");
		System.out.println(s);
		System.out.println("MY Name is :" + name.toUpperCase());
		System.out.println("MY Name is :" + name.toLowerCase());
		System.out.println(name.length());
		System.out.println(name.trim().length());
		System.out.println(""+ name.replace("s","Z"));
		System.out.println(s.startsWith("R"));
		System.out.println(s.endsWith("h"));
		System.out.println(s.concat(name));
		System.out.println(s.equals(name));
		System.out.println(s.equals("ramesh"));
		   System.out.println(s.equalsIgnoreCase("ramesh"));
		   System.out.println(s.charAt(2));
		
	
	
	
	}

}
