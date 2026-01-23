package iterator_example;

import linkedlist_example.Linkedlist_Example1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterator_Example1 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("ali" , "hasan" , "zahra");
        Iterator<String> itr = names.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
