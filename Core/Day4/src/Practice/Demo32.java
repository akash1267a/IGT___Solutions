package Practice;

public class Demo32 {

	public static void main(String[] args) throws FileNotFoundException
	{
		m1();

	}
	static void m1() throws FileNotFoundException
	{
		m2();
		System.out.println("M1 method");
	}
	static void m2() throws FileNotFoundException
	{
		m3();
		System.out.println("M2 method");
	}
	static void m3() throws FileNotFoundException
	{
		File f = new File("abc.txt");
		FileReader fr = new FileReader(f);
	}
}


// throws

	//to handle the checked the excetpion
	// it will pass the exception to the caller method
	// so better always use try and catch block