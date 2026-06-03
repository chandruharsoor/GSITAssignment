package oopsConcepts;

class vehicals {
	
	void fuleType() {
		System.out.println("This runs on fule");
	}
	
}

class ElectricCar extends vehicals {
	
	void fuleType() {
		System.out.println("This runs on electricity");
	}
}

public class InheritanceWithMethodOverriding {

	public static void main(String[] args) {
		
		vehicals vh = new vehicals();
		vh.fuleType();
		
		ElectricCar EC = new ElectricCar();
		EC.fuleType();

	}

}
