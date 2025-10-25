import java.util.Scanner;

public class E_6_1_e {
    public static void main(String[] args) {

        int number;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        number = scanner.nextInt();
        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            number /= 10;
        }
        System.out.println("sum of odd digits is:" + sum);
    }
}
