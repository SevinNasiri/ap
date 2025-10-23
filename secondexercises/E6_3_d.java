package secondexercises;

import java.util.Scanner;

public class E6_3_d {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string:");
        String input = scanner.nextLine();

        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if ("aeiou".indexOf(c) != -1){
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);
    }
}
