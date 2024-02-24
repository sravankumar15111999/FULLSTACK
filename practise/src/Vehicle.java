public class Vehicle {
    String make;
    String model;
    int year;

    void start(){
        System.out.println("The vehicle has started");

    }
    void details(String make, String model,int year){
        System.out.println(make);
        System.out.println(model);
        System.out.println(year);
    }
    public static void main(String[]args){
        Vehicle c = new Vehicle();
        c.details("Suzuki","Swift",2016);
        c.start();
    }
}
