package Practice;

class A
{
	public void display()
	{
		System.out.println("Hiiiiii");
		
	}
}
class B extends A
{
	public void display()
	{
		//same method name but different implementation in child class....: overriding
		System.out.println("Hellol")
	}
}

public class Demo19B {

	public static void main(String[] args) {
		B b = new B();
		b.display()

	}

}
