package assignmentLooping;
import java.util.Scanner;

public class MenuCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = scanner.nextInt();
            
           
            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();
                
                if (choice == 1) {
                    System.out.println("Result: " + (num1 + num2));
                } else if (choice == 2) {
                    System.out.println("Result: " + (num1 - num2));
                } else if (choice == 3) {
                    System.out.println("Result: " + (num1 * num2));
                } else if (choice == 4) {
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Error: Cannot divide by zero!");
                    }
                }
            } else if (choice == 5) {
                System.out.println("Exiting the calculator. Goodbye!");
            } else {
                System.out.println("Invalid choice! Please select between 1 and 5.");
            }
            
        } while (choice != 5);
        
        scanner.close();
    }
}
