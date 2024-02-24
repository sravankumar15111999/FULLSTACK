public class Book {
int id;
String name;
String author;
boolean isCheckedOut = false;


     void checkOut() {
         if (isCheckedOut == true) {
             System.out.println("The book is checkedOut");

         } else {
             System.out.println("The book is not checkedOut");
         }
     }

         void returnBook() {
             if (isCheckedOut == false) {
                 System.out.println("Book is returned");

             } else {
                 System.out.println("Book is not returned");
             }
         }

    void details(int id, String name,String author) {
        System.out.println(id);
        System.out.println(name);
        System.out.println(author);
        System.out.println((isCheckedOut ? "YES" :"NO"));
    }

    public static void main(String[]args){
         Book l = new Book();
         l.details(251,"Music","Justin");
         l.checkOut();
         l.returnBook();
    }



}
