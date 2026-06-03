package oopsConcepts;

class Calculator{
	
	public int add(int a , int b) {
		
		System.out.println(a+b);
		
		return a+b; 
	}
	
	public double add(double a, double b) {
		System.out.println(a+b);
		
		return a+b;
	}
	
}

public class methodOverloading {

	public static void main(String[] args) {
	
		Calculator cal = new Calculator();
		
		cal.add(12,23);
		cal.add(12.4,13.7);

	}

}
