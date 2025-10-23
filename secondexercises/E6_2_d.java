package secondexercises;

import java.util.Scanner;

public class E6_2_d {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int size;
        int numbers[] = new int[100];
        System.out.println("Enter count of numbers:");
        size = scanner.nextInt();
        System.out.println("Enter numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("All adjacent duplicates:");
        for (int i = 0; i < size; i++) {
            if (numbers[i] == numbers[i + 1] && (i == 0 || numbers[i] != numbers[i - 1]))
                System.out.println(numbers[i] + "\n");
        }
    }
}
