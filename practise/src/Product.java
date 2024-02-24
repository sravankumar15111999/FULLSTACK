public class Product {
    int id;
    String name;
    int p;
    int s;

    void stock(int x,int s){
        int k = s + x;
       System.out.println("The stock is " + k);

    }
    void deduct(int y,int s){
        int a = s-y;
        System.out.println("The deduct stock is " + a);

    }
    void details(int id, String name, int p, int s){
        System.out.println(id);
        System.out.println(name);
        System.out.println(p);
        System.out.println(s);

    }
    public static void main(String[]args){
        Product l = new Product();
        l.details(457,"Books",57,457);
        l.stock(15,457);
        l.deduct(20,457);
    }

}
