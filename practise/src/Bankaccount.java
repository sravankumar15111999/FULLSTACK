public class Bankaccount {

    String n;
    int a;
    long b;

    void deposit(){

    }
    void withdrawal(){

    }
    void checkBalance(){

    }

    void details( String n, int a, long b) {
        System.out.println(n);
        System.out.println(a);
        System.out.println(b);

    }


public static void main(String[]args){
        Bankaccount b = new Bankaccount();
        b.details("Kandhikya", 524353,50000);

}
}
