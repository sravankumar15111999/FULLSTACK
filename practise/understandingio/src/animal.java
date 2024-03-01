public abstract class animal {


    public abstract void sound();

    public void sleep(){
    System.out.println("zzzzzzzzzzzz");
}}
class dog extends animal{

    public void sound(){
        System.out.println("sleeping");
    }
    public static void main(String[]args){
        dog Dog = new dog();
        Dog.sound();
    }
}
