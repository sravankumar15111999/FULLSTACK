import java.util.ArrayList;
import java.util.Arrays;

public class Bankdomain {
    ArrayList<Integer> positive = new ArrayList<>(Arrays.asList(15000,13000,90000,11000));
    ArrayList<Integer> negative  = new ArrayList<>(Arrays.asList(-10000,-13000,-8000,-110));

    public void addtrans(){
        positive.add(5000);
        negative.add(-2000);
        //System.out.println("the new transcation is " + positive.get(4));
        System.out.println(positive);
        System.out.println(negative);

    }
    public int TotalBalance() {
        int totalBalance = 0;

        for (int amount : positive) {
            totalBalance += amount;
        }

        for (int amount : negative) {
            totalBalance += amount;
        }
        System.out.println("The total balance is " + totalBalance);
        return totalBalance;
        //int totalBalance = k.TotalBalance();

        //System.out.println("The total balance is " + totalBalance);
    }
    public void deposit(){
        int max = positive.get(0);
        for(int i=0;i<positive.size();i++){
            if(positive.get(i) >= max){
                max = positive.get(i);
            }
        }
        System.out.println("The highest deposit is " + max);
    }
     public void withdrawal(){
         int max = negative.get(0);
         for(int i=0;i<negative.size();i++){
             if(negative.get(i) <= max){
                 max = negative.get(i);
             }
         }
         System.out.println(" The highest withdrawal is " + max);
     }
         public static void main(String[] args) {
        Bankdomain k = new Bankdomain();

        k.addtrans();
        k.TotalBalance();
        k.deposit();
        k.withdrawal();


    }
}
