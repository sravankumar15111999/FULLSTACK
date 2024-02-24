import java.util.Scanner;

public class grade {

    public static void main(String[]args){

        Scanner grades = new Scanner(System.in);
        System.out.println("Please enter the first subject");
        int first = grades.nextInt();
        System.out.println("Please enter the second subject");
        int second = grades.nextInt();
        System.out.println("Please enter the third subject");
        int third= grades.nextInt();
        System.out.println("Please enter the fourth angle");
        int fourth= grades.nextInt();
        System.out.println("Please enter the fifth angle");
        int fifth = grades.nextInt();

        int Total_marks= first + second + third+ fourth + fifth;
        float percentage = (((float) Total_marks / 500) * 100);


        String grade;

        if (90 <= percentage & percentage <= 100){
            grade = "A";
        }
        else if (70 <= percentage & percentage < 90) {
            grade = "B";
        }
        else if (50 <= percentage & percentage < 70){
            grade = "C";
        }
        else if (30 <= percentage & percentage < 50){
            grade = "D";
        }
        else {
            grade = "F";
        }
        System.out.println("The total marks is "+ Total_marks);

        System.out.println("The percentage is " + percentage);

        System.out.println(" The grade is " + grade);






    }

}
