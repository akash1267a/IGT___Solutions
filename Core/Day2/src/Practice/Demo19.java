class A {
	
	public void display() {
	
		System.out.println("Hiiiiiiiii");
	}
}

class B extends A {
	
	public void display() {
	
		System.out.println("Hellloooooo");
	}
}

class Demo19 {

	public static void main(String[] args) {
		
		B b = new B();
		b.display();
	}
}