package exercises.e1;

public class Book {
    String title;
    String author;
    float price1;
    int pages;

    public Book(String title, String author, float price1, int pages){
        this.title = title;
        this.author = author;
        this.price1 = price1;
        this.pages = pages;
    }

    public void info(){
        System.out.println("title: " + title);
        System.out.println("author: " + author);
        System.out.println("price: " + price1);
        System.out.println("pages: " + pages);
    }

    public void price(){
        if (price1 > 50){
            System.out.println("expensive book");
        }
    }
}
