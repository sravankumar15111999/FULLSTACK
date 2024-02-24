//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Area {

    int l;
    int b;
    double r;

    void circle(double r){
        System.out.println(3.142 * r *r);

    }

    void Rectangle(int l , int b){

        System.out.println(l*b);
    }


    public static void main(String[] args) {
        Area k = new Area();


        k.circle(5);

        k.Rectangle(6, 9);

    }

}