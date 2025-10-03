package exercises.e1;

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book("Harry Potter" , "j.k.rowling" , 70f , 500);
        b1.info();
        b1.price();

        System.out.println("--------------------");

        Book b2 = new Book("The Godfather" , "Mario Puzo" , 40f , 300);
        b2.info();
        b2.price();
    }
}
