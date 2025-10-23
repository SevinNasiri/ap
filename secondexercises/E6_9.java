package secondexercises;

import java.util.Scanner;

public class E6_9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word;
        char character;
        System.out.println("Enter a word:");
        word = scanner.nextLine();
        System.out.println("reversed word is:");
        for (int i = word.length() - 1; i >= 0; i--) {
            character = word.charAt(i);
            System.out.print(character);
        }
    }
}
