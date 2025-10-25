import java.util.Scanner;

public class E_6_3_a {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        for (int i=0 ; i<input.length() ; i++){
            char u = input.charAt(i);
            if (Character.isUpperCase(u)){
                System.out.println(u);
            }
        }
    }
}
