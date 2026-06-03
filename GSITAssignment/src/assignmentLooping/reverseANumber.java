package assignmentLooping;

import java.util.Scanner;

public class reverseANumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter a number: ");
	        
        int num = scanner.nextInt();
        
        int rnum = 0;
        
        while(num!=0) {
        	
        	int d = num % 10;
        	rnum = rnum * 10 + d;
        	num = num/10;
        
        } 
        System.out.println(rnum);
        scanner.close();
	}
		
}
