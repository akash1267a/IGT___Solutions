package Learning;

class Calc
{
	int num1;
	int num2;
	int result;
	
	public void perform()
	{
		result = num1 + num2;
	}
	
	
}


public class ObjectDemo {

	public static void main(String[] args) {
		Calc obj = new Calc();
		obj.num1 = 1;
		obj.num2 = 4;
		obj.perform();
		System.out.println(obj.result);

	}

}
