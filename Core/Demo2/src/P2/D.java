package P2;
import P1.A;
public class D extends A {
	void display()
	{
		System.out.println(a1);
		//System.out.println(b1); private only for single class
		System.out.println(c1);// yes : only sub class
		//System.out.println(d1); default is oonly for singel class
		
	}
}
class E
{
	void display()
	{	A a = new A();
		System.out.println(a.a1);
		//System.out.println(a.b1); private only for single class
		//System.out.println(a.c1); bcz its not a subclass
		//System.out.println(a.d1);
	}
}
class F extends A
{
	void display()
	{
		System.out.println(a1);
		//System.out.println(b1); private only for single class
		System.out.println(c1);
		//System.out.println(d1);
	}
}