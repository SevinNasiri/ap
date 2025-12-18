public class Main2 {

    public static void main(String[] args) {

//        int[] book = new int[3];
//
//        book[0] = 5;
//        book[1] =  10;
//        book[2] = 13;
//
        Book[] books = new Book[3];

        Book b1 = new Book("harry potter" , "ggg",66);


        BookStore bookStore = new BookStore();
        bookStore.addBook(b1);
        Book b2 = new Book("harry potter", "j.k", 1990);
        bookStore.addBook(b2);
        books[0]=b1;

    }
}
