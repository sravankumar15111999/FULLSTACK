import java.util.Scanner;

public class mph {


        public static void main(String[]args) {
            Scanner speed = new Scanner(System.in);
            System.out.println("Please enter the speed in KMPH");
            int  number = speed.nextInt();

            float MPH = (float)(number * 0.621371);
            System.out.println("The car is travelling in  " + MPH +" MPH");
        }
}
