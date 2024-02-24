public class TourPackage {
    int id;
    String d;
    int n;
    int p;
    void update(int u,int p){
         p+=u;
        System.out.println("The updated price " + p);

    }
    void details(int id, String d, int n, int p){
        System.out.println(id);
        System.out.println(d);
        System.out.println(n);
        System.out.println(p);


    }
    public static void main(String[]args) {
        TourPackage k = new TourPackage();
        k.details(251, "Texas", 7, 2500);
        k.update(1000, 2500);
    }
}

