public class Radius {

    int radius;

    // Constructor for Circle with a specified radius
    public Radius(int radius) {
        this.radius = radius;
    }
    // Method to calculate and print the area of the circle
    public void area(){
         double area= Math.PI * radius * radius ;
        System.out.println("The area of the circle is " + area);

    }
    // Method to calculate and print the perimeter of the circle
    public void perimeter(){
        double perimeter = 2 * Math.PI * radius;
        System.out.println(" The perimeter of the circle is " + perimeter);
    }


}
