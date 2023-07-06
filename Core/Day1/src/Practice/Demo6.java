package Practice;

class A {
	A () {
		System.out.println("Class A");
	}
	
	void abc() {

		int a = 10, b = 20, c = 55, res;

		if(a > b && a > c) res = a;
		else if(b > a && b > c ) res = b;
		else res = c;

		System.out.println(res);
	}
}

class Demo6 {
	public static void main(String[] args) {
		A a = new A();
		a.abc();
	}
}

/*
constructor									Method

same name as class name								same + other name also		

no return type									must have return type

always try to create once							utilize with multiple times

internally allocates memory							it utilizes the same memory
*/