package iterator_example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterator_Example2 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println("first is: " + numbers);

        Iterator<Integer> itr = numbers.iterator();

        while (itr.hasNext()){
            Integer num = itr.next();
            if (num % 2 == 0){
                itr.remove();
                System.out.println("remove: " + num);
            }
        }

        System.out.println("remain numbers: " + numbers);
    }
}
