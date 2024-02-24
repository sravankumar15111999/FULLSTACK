import java.util.ArrayList;
import java.util.Arrays;

public class Patient {
 ArrayList<Double> temp = new ArrayList<>(Arrays.asList(35.0,36.7,38.0,35.5));

 public void newtemp(){
  temp.add(40.0);
  System.out.println("The temperatures are : " + temp);
 }

 public void average(){
     double sum = 0;
     for(int i=0;i<temp.size();i++) {
          sum = sum + temp.get(i);
     }
     double avg = sum/temp.size();
     System.out.println( " The average temperature is " + avg);

 }
 public void highesttemp(){
     double max = temp.get(0);
     for(int i=0;i<temp.size();i++){
         if(temp.get(i) >=max){
             max = temp.get(i);


         }
     }
     System.out.println("The Highest Tempearture recorded is " + max);

 }
 public void fever(){
     double count = 0;
     double high = 37.5;


     for(double patients : temp){
         if(patients > high){
             count++;
         }
     }
     System.out.println("Number of Patients has fever is " + count);


 }

  public static void main(String[]args){
   Patient k = new Patient();
   k.newtemp();
   k.average();
   k.highesttemp();
   k.fever();
 }


}

