package Practice;
import java.io.*;
import java.util.*;
public class Demo33 {

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
		try
		{
		File f = new File("abc.txt");
		FileReader fr = new FileReader(f);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Something went wrong with file");
		}
		finally
		{
			System.out.println("Thank You....!")
		}
	}
}

