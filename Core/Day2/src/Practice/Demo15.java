package Practice;


class Aa {
	
	Aa() {
		System.out.println("A()");
	}

	Aa(int a) {
		System.out.println("A(int a)");
	}

	Aa(int a, String s) {
		System.out.println("A(int a, String s)");
	}
}

class Demo15 {
	
	public static void main(String[] args) {
		
		Aa a = new Aa();
		Aa a1 = new Aa(10);
		Aa a2 = new Aa(20, "Akku");
	}
}
// over loading ?
// same constructon name + with difrent parameter + in same class = is called constructor over loading 	
