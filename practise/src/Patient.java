public class Patient {
    int id;
    String n;
    String d;

    void details( int id, String n, String d){
        System.out.println(id);
        System.out.println(n);
        System.out.println(d);
    }
    public static void main(String[]args){
        Patient l = new Patient();
        l.details(3457,"yashu","Bodyscan" );
    }
}
