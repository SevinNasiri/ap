package exercises.e2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your year of birth:");
        int year = scanner.nextInt();

        int calculate;
        calculate = 2025 - year;

        System.out.println("your age is: " + calculate);
        if (calculate < 18){
            System.out.println("you are teenager.");
        }else
            System.out.println("you are adult.");
    }
}
