package arraylist_example;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_Example3 {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        al.add("ali");
        al.add("mohammad");
        al.add("jafar");

        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("ali");
        al2.add("sara");
        al2.add("amir");
        al.retainAll(al2);

        Iterator itr = al.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
