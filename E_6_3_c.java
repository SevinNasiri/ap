import java.util.Scanner;

public class E_6_3_c {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string:");
        String input = scanner.nextLine();

        String result = input.replaceAll("[aeiou]", "_");
        System.out.println("result: " + result);
    }
}
