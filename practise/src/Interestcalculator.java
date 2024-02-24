public class Interestcalculator {
    int p;
    int r;
    int t;

    void Simpleinterest(int p, int r, int t){
        System.out.println((p*r*t)/100);
    }
    public static  void main(String[]arg){
        Interestcalculator k = new Interestcalculator();
        k.Simpleinterest(25000,6,4);


    }
}
