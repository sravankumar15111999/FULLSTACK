import java.util.Scanner;

public class cube {


    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Prompt the user to enter a positive number
        System.out.println("please enter a  postive number");
        int a  = sc.nextInt();
        // Calculate the cube of the entered number using Math.pow
        double b = Math.pow(a,3);

        System.out.println("cube is :" +b);




    }
}
