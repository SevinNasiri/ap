package arraylist_example;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_Example1 {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        al.add("jafar");
        al.add("morad");

        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("maryam");
        al.addAll(al2);

        Iterator itr = al.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
