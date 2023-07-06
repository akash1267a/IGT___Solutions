package Practice;

class A
{
	static int x  = 10;
	static void abc()
	{
		System.out.println(Hii abc method);
		}
}

public class Demo24 {

	public static void main(String[] args) {
		//A a = new A();
		//a.abc();
		//System.out.println("X:" + a.x);
		A.abc();
		System.out.print("X " + A.x);
		

	}

}
//static : it will not belongs to object
// without creating a object we can access