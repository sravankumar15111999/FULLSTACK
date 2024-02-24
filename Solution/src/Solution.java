import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the String");
        System.out.println("Please enter the Integer");
        String myString = scanner.next();
        //System.out.println("Please enter the String");
        //Scanner.close();
        int myInt = scanner.nextInt();

        System.out.println("myString is " + myString);
        System.out.println("myInt is  " + myInt);
    }
}