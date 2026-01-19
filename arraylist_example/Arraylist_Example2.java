package arraylist_example;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_Example2 {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();

        al.add("jafar");
        al.add("maryam");
        al.add("hasan");

        ArrayList<String> al2 = new ArrayList<String>();

        al2.add("maryam");
        al2.add("hasan");
        al.removeAll(al2);

        Iterator itr = al.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
