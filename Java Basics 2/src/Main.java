import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner Name = new Scanner(System.in);
        System.out.println("Please enter the number");
        int monthNumber = Name.nextInt();


        if (monthNumber == 1) {
            System.out.println("The month is January");
        } else if (monthNumber == 2) {
            System.out.println("The month is February");
        } else if (monthNumber == 3) {
            System.out.println("The month is March");
        } else if (monthNumber == 4) {
            System.out.println("The month is April");
        } else if (monthNumber == 5) {
            System.out.println("The month is May");
        } else if (monthNumber == 6) {
            System.out.println("The month is June");
        } else if (monthNumber == 7) {
            System.out.println("The month is July");
        } else if (monthNumber == 8) {
            System.out.println("The month is August");
        } else if (monthNumber == 9) {
            System.out.println("The month is September");
        } else if (monthNumber == 10) {
            System.out.println("The month is October");
        } else if (monthNumber == 11) {
            System.out.println("The month is November");
        } else if (monthNumber == 12) {
            System.out.println("The month is December");
        } else {
            System.out.println("This is a Invalid month number");
        }




    }
}