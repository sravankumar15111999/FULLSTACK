package scaneer;

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args){
        // Create a Scanner object to read input from the user
        Scanner scaneer = new Scanner(System.in);
        // Prompt the user to enter a positive number
        System.out.println("please enter a  postive number");
        int input1  = scaneer.nextInt();
        // Display the multiplication table for the entered number
        System.out.println( "The multiplication table for " + input1);

        // Iterate from 1 to 10 to print the multiplication table
        for (int i=1; i<=10; i++){
            // Calculate the result (product of input1 and i)
            int result = input1 * i;
            System.out.println(  result);
        }


    }
}
