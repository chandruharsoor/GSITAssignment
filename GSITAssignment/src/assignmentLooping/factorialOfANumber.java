package assignmentLooping;

import java.util.Scanner;

public class factorialOfANumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
	        
        int num = scanner.nextInt();
        long fact = num;
        
        for(int i = num-1 ; i >= 1 ; i--) {
        	
        	fact = fact * i;
        }
        
        System.out.println("Factorial of a number is " + fact);
        scanner.close();
	}

}
