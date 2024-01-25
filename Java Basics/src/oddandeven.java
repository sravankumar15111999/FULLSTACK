import java.util.Scanner;

public class oddandeven {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner k = new Scanner(System.in);
        // Prompt the user to enter a number
        System.out.println("Please enter a number");

        int i = k.nextInt();

        // Check if the number is even or odd
        if ( i % 2 == 0) {
            // If the remainder is 0, the number is even
            System.out.println("The number is even");
        }
        else {
            // If the remainder is not 0, the number is odd
            System.out.println("The number is odd");
        }
    }
}