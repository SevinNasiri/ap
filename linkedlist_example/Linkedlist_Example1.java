package linkedlist_example;

import java.util.*;

public class Linkedlist_Example1 {
    public static void main(String[] args) {

        LinkedList<String> classQueue = new LinkedList<String>();

        classQueue.addLast("ali");
        classQueue.addLast("reza");
        classQueue.addLast("hasan");
        classQueue.addLast("maryam");
        classQueue.addLast("zahra");

        System.out.println("count of people: " + classQueue.size());
        System.out.println("people: " + classQueue);
        System.out.println("first one: " + classQueue.getFirst());
        System.out.println("last one: " + classQueue.getLast());
    }
}
