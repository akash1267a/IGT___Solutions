package Practice;


//final class car
class Car
{
	final int speed = 200;
	//100 var
	//1000 method
	final void run()
	{
		System.out.println("Hi runmethod with speed 200");
	}
}
class Maruthi extends Car
{
	//void run()
	//{
	//	System.out.prointln("Hii runmethod with speed of 250);//final method cannt be overriden
	//}
	
}

public class Demo25 {
	public static void main(String args[])
	{
		Car c  = new Car();
		c.run();
		System.out.println("Speed : "+ c.speed);
		 
		//c.speed = 2000; // we cant modify the final variable
		System.out.println("Speed:"+ c.speed);
		
		Maruthi m = new Maruthi();
		m.run();
		
	}
}
