import java.util.Scanner;

public class basiccalculator {

    public static void main(String[]args){

        Scanner Case = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int num1 = Case.nextInt();

        System.out.println( "Please enter the second number");
        int num2 = Case.nextInt();

        System.out.println("Select the operator");
        System.out.println("1.Addition");
        System.out.println("2.Subraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");

        System.out.println(" Enter the number of the operator ");
        int choice = Case.nextInt();

        double result;

        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = (double) num1 / num2;
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        System.out.println("Result: " + result);





    }
}
