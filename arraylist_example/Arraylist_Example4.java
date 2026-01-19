package arraylist_example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Arraylist_Example4 {
    public static void main(String[] args) {

        ArrayList<String> countries = new ArrayList<String>();

        countries.add("india");
        countries.add("us");
        countries.add("china");
        countries.add("japan");

        System.out.println("before sorting:");

        for (String counter : countries){
            System.out.println(counter);
        }

        Collections.sort(countries);

        System.out.println("after sorting:");

        for (String counter : countries){
            System.out.println(counter);
        }
    }
}
