package iterator_example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterator_Example3 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("puria" , "nika" , "sara" , "mohamad" , "ali"));

        System.out.println("first: " + names);

        Iterator<String> itr = names.iterator();
        while (itr.hasNext()){
            String name = itr.next();
            if (name.length() < 4){
                itr.remove();
                System.out.println("remove: " + name);
            }
        }
        System.out.println("last list is: " + names);
    }
}
