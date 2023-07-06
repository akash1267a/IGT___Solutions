package Practice;

class Emp {

	Emp(int id, String Name, int age, int salery, String desig, String pan) {
		System.out.println("yes perfect HR");
	}

	Emp(int id, String Name, String project , String loc) {
		System.out.println("yes perfect Manager");
	}
}

class Demo17 {
	
	public static void main(String[] args) {
		
		Emp e1 = new Emp(100,"Rama",35,45678,"Dev","ABC123");
		Emp e2 = new Emp(100,"Rama","Facebok","Banglore");
	}
}
