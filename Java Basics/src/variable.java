import java.util.Scanner;

public class variable {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scaneer = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.println( "Please enter three numbers");

        // Read three integers from the user
        int a = scaneer.nextInt();
        int b = scaneer.nextInt();
        int c = scaneer.nextInt();
        // Find the maximum of the three numbers using Math.max
        int result = Math.max(Math.max(a,b),c);

        System.out.println( " The highest number is " + result);

    }
}
