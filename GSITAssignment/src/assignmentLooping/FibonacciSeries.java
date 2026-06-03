package assignmentLooping;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms (N): ");
        int N = scanner.nextInt();
        
       
        int firstnum = 0;
        int secondnum = 1;
        
        System.out.print("Fibonacci Series up to " + N + " terms: ");
        
       
        for (int i = 1; i <= N; i++) {
            System.out.print(firstnum + " ");
            
           
            int nextnum = firstnum + secondnum;
            
            
            firstnum = secondnum;
            secondnum = nextnum;
        }
        
        System.out.println(); 
        scanner.close();
    }
}
