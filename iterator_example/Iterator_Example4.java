package iterator_example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterator_Example4 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 15, 20, 25, 30, 35, 40));

        System.out.println("first: " + numbers);

        Iterator<Integer> itr = numbers.iterator();

        while (itr.hasNext()) {
            Integer num = itr.next();
            if (!(num >= 20 && num <= 35)) {
                itr.remove();
                System.out.println("remove: " + num);
            }
        }

        System.out.println("last list: " + numbers);


    }


}
