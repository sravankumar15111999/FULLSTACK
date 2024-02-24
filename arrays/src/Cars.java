
import java.util.ArrayList;
import java.util.Arrays;


public class Cars {
    ArrayList<Integer> carsspeed = new ArrayList<>(Arrays.asList(120,130,90,110));
    void new_speed(){
        carsspeed.add(140);
        System.out.println("Speeds of all cars on the highway: " + carsspeed);
    }
    public void averagespeed(){
        int sum = 0;
        for(int i=0;i<carsspeed.size();i++) {
            sum = sum + carsspeed.get(i);
        }
         double avg = sum/carsspeed.size();
        System.out.println("The average speed is  " + avg);
    }
    public void maximumspeed(){


        int max = carsspeed.get(0);
        for(int i=0;i<carsspeed.size();i++){
            if(carsspeed.get(i) >= max){
                max = carsspeed.get(i);
            }
        }

        System.out.println( "Maximumspeed is: " + max);

    }
    public void overspeed(){
        int count = 0;
        int speedLimit = 100; // Speed limit in km/h

        for (int speed : carsspeed) {
            if (speed > speedLimit) {
                count++;
            }
        }
        System.out.println( "Number of cars exceed 100km/ph is " + count);
    }

    public static void main(String[] args) {
        Cars car = new Cars();
        car.new_speed();
        car.averagespeed();
        car.maximumspeed();
        car.overspeed();



    }



}

