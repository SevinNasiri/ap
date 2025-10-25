import java.util.Scanner;

public class E_6_2_c {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size;
        int cumulativesum = 0;
        int numbers[] = new int[100];
        System.out.println("Enter count of numbers:");
        size = scanner.nextInt();
        System.out.println("Enter numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Cumulative totals:");
        for (int i = 0; i < size; i++) {
            cumulativesum += numbers[i];
            System.out.println(cumulativesum + "\n");
        }
    }
}
