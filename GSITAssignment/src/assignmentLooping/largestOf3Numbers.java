package assignmentLooping;

public class largestOf3Numbers {

    public static void main(String[] args) {

        int a = 10;
        int b = 40;
        int c = 30;

        int max;

        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }

        System.out.println("Largest number is: " + max);
    }
}