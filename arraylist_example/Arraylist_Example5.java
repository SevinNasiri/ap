package arraylist_example;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arraylist_Example5 {
    public static void main(String[] args) {

        ArrayList<Integer> arryList = new ArrayList<Integer>();

        arryList.add(5596345);
        arryList.add(856);
        arryList.add(15962);

        System.out.println("before sorting:");

        for (int a : arryList){
            System.out.println(a);
        }

        Collections.sort(arryList);

        System.out.println("after sorting:");

        for (int a : arryList){
            System.out.println(a);
        }


    }
}
