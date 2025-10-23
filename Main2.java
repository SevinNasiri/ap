
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter count of numbers:");
        int k = scanner.nextInt();

        int[] numbers = new int[k];

        for (int i = 0; i < k; i++) {
            numbers[i] = random.nextInt(100);
        }

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < k; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        for (int i = 1; i < k; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        for (int num : numbers) {
            System.out.println(num);
        }

//        Arrays.sort(numbers);
//
//        System.out.println("after sorting:");
//        for (int num1 : numbers){
//            System.out.println(num1);
//        }

        for (int i = 0; i < k - 1; i++) {
            for (int j = 0; j < k - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {

                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.println("after sorting:");
        for (int num1 : numbers) {
            System.out.println(num1);
        }

        System.out.println("max: " + max);
        System.out.println("min: " + min);


    }
}
