
package Practice;

abstract class A
{
	abstract void abc();
	
}
abstract class B extends A
{
	void abc()
	{
		System.out.println("ABC method");
	}
}
class C extends B
{
	void xyz()
	{
		System.out.println("XYZmethod");
	}
}

class Demo20
{
	public static void main(String args[])
	{
		//A a = new A();
		//B b = new B();
		//b.abc();
		
		C c = new C();
		c.abc();
		c.xyz();
	}
}





