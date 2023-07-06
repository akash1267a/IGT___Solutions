package P1;

public class A{
	
	public int a1 = 100; //in smae package
	private int b1  = 200; //only  in singel class
	protected int c1 = 3000; //smae package + subclass
	int d1 = 400;
	void display() {
	System.out.println(a1);
	System.out.println(b1);
	System.out.println(c1);
	System.out.println(d1);
	}
}

class B extends A
{
	void display()
	{
		System.out.println(a1);
		//System.out.println(b1); private only for single class
		System.out.println(c1);
		System.out.println(d1);
	}
}

class c
{
	void display()
	{
		System.out.println(a1);
		//System.out.println(b1); private only for single class
		System.out.println(c1);
		System.out.println(d1);
	}
}


