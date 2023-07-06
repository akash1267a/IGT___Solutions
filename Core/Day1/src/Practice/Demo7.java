package Practice;

class A {
	int a1 = 10;
}

class B extends A {
	
	int a1 = 100;
	void xyz(int a1) {

		System.out.println(a1);
		System.out.println(this.a1);
		System.out.println(super.a1);
	}
}

class Demo7 {

	public static void main(String[] args) {
		
		B b = new B();
		b.xyz(1000);
	}
}