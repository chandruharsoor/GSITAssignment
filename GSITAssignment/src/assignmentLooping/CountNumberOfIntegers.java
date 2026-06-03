package assignmentLooping;

import java.util.Scanner;

public class CountNumberOfIntegers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        int originalNum = num;
        int count = 0;
        
        if (num == 0) {
            count = 1;
        } else {
        	
            while (num != 0) {
            num = num / 10; 
            count = count + 1; 
            
        }
        
        System.out.println("Number of digits in " + originalNum + " is: " + count);
        scanner.close();
    }
	}
}
