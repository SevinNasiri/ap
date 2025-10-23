package secondexercises;

import java.util.Scanner;

public class E6_3_b {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        String words[] = input.split(" ");

        for (String word : words) {
            if (word.length() >= 2) {
                System.out.println(word.charAt(1));
            }
        }
    }
}
