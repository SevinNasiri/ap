package secondexercises;

import java.util.Arrays;
import java.util.Scanner;

public class E5_18 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 3 string:");
        String line;
        line = scanner.nextLine().toLowerCase();
        String[] split = line.split(" ");

        Arrays.sort(split);

        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
    }
}
