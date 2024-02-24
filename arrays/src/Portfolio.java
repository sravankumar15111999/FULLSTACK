import java.util.ArrayList;
import java.util.Arrays;

public class Portfolio {

    public double[] investments;

    public int size;
    public static final int MAX_SIZE = 100;

    public Portfolio() {
        investments = new double[MAX_SIZE];
        size = 0;
    }

    public void addInvestment(double value) {
        if (size < MAX_SIZE) {
            investments[size] = value;
            size++;
            System.out.println("Added investment: " + value);
            System.out.println("The investments are " + size);
        } else {
            System.out.println("Portfolio is full. Cannot add more investments.");
        }
    }

    public double totalValue() {
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += investments[i];
        }

        return total;
    }

    public double highestValueInvestment() {
        if (size == 0) {
            System.out.println("No investments found.");
            return 0; // or throw an exception indicating no investments
        }

        double max = investments[0];
        for (int i = 1; i < size; i++) {
            if (investments[i] > max) {
                max = investments[i];
            }
        }
        System.out.println("The highest value investment is: " + max);
        return max;
    }

    public double averageValue() {
        if (size == 0) {
            System.out.println("No investments found.");
            return 0; // or throw an exception indicating no investments
        }

        double total = totalValue(); // Calculate total value only once
        double average = total / size;
        System.out.println("The average value of investments is: " + average);
        System.out.println("The total value of investments is: " + total);
        return average;
    }




    public static void main(String[] args) {
        Portfolio k = new Portfolio();

        // Add some investments
        k.addInvestment(15000);
        k.addInvestment(13000);
        k.addInvestment(90000);
        k.addInvestment(11000);

        // Print out results
        k.totalValue();
        k.highestValueInvestment();
        k.averageValue( );
    }
}
