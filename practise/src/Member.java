import java.time.LocalDate;


public class Member {
    int id;
    String name;
    String type;
    LocalDate currentDate = LocalDate.of(2023,5,10);
    void upgrade(String increase){
        String Type = increase ;
        System.out.println("The  membership has upgraded to " + Type);

    }
    void details(int id, String name, String type){
        System.out.println(id);
        System.out.println(name);
        System.out.println(type);
        System.out.println(currentDate);

    }
    public static void main(String[]args){
        Member c = new Member();
        c.details(123,"santhosh","Regular");
        c.upgrade("Premium");
    }


}
