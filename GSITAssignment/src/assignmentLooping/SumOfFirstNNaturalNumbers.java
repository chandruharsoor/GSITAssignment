package assignmentLooping;

import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.print("Enter a number: ");
	     int num = sc.nextInt();
	     
	     int totalSum = 0 ;
	     
	     while(num > 0) {
	    	 
	    	 totalSum = totalSum + num;
	    	 num = num - 1;
	     }
	     
	     System.out.println("The sum is: " + totalSum);
	     sc.close();
	}

}
