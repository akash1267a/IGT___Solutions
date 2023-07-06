package Practice;

class Parent {
	int site = 5;
	int money = 500000;
	String car = "BMW";
}

class Child extends Parent {
	int money = 10000;
	
	void use () {
		System.out.println("Site: " + site);
		System.out.println("Child money: " + money);
		System.out.println("Parent money: " + super.money);
		System.out.println("Both money: " + (money + super.money));
		System.out.println("Car: " + car);
	}
}

class Demo8 {
	public static void main(String[] args) {
		Child c = new Child();
		c.use();
	}
}