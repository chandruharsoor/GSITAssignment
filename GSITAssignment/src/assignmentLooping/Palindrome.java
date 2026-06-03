package assignmentLooping;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.print("Enter a number: ");
	        
       int num = scanner.nextInt();
       int originalNum = num;
       int rnum = 0;
       
       while(num!=0) {
       
       	int d = num % 10;
       	rnum = rnum * 10 + d;
       	num = num/10;
       
       } 
       System.out.println("Reversed number is " + rnum);
       
       if(originalNum==rnum) {
    	   System.out.println(originalNum + " is a Plaindrime");
       }else {
    	   System.out.println(originalNum + " is not a Plaindrime");
       }
       scanner.close();
	}

}

