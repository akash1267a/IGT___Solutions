package Practice;


class A {

	A() {

		System.out.println("Class A");
	}
}


class B {

	B() {

		System.out.println("Class B");
	}
}


class C {

	C() {

		System.out.println("Class C");
	}
}


class Demo3 {

	public static void main(String[] args) {

		System.out.println("Class Demo");

		A a = new A();
		B b = new B();
		C c = new C();
	}
}