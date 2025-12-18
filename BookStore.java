public class BookStore {

   private Book[] books;
   int counter;
   public BookStore() {
       books = new Book[3];

       counter = 0;

   }

   public void addBook(Book book ){
       books[counter]=book;
       counter++;
       while (true) {
           counter++;
           if (counter > 3) {
               break;
           }
           System.out.println(counter);
       }

   }



}
