import java.util.SplittableRandom;

public class Book {

    private String name;
    private String writter;
    private int year;

    public Book(String name , String writter , int year){
        this.name = name;
        this.writter = writter;
        this.year = year;
    }

    public String getName(String name){
        return name;
    }

    public String getWritter(String writter){
        return writter;
    }

    public int getYear(int year){
        return year;
    }




}
