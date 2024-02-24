public class Employee {
    int id;
    String name;
    String dep;
    int salary;
    void increase(int update,int salary){
        int increment = update + salary;
        System.out.println("The new salary is  " + increment);

    }
    void details(int id, String name, String dep,int salary){
        System.out.println(id);
        System.out.println(name);
        System.out.println(dep);
        System.out.println(salary);

    }
    public static void main(String[]args){
        Employee r = new Employee();
        r.details(54321,"Niranjan","Developer",5000);
        r.increase(2000,5000);
    }
}
