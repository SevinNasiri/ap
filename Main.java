
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



Random random = new Random();

        System.out.println("please enter a number:");
        int k = scanner.nextInt();

        int min = 100;
        int max = 1000;
        int sum = 0;

        for (int i=0 ; i< k ; i++) {
            int number = random.nextInt(901) + 100;

            if (i ==0){
                min = number;
                max = number;
            }
            if (number < min)
                min = number;

            if (number > max)
                max = number;

            sum += number;

            System.out.println(number);
        }

        float average = (float) sum/k;

        System.out.println("min: " + min);
        System.out.println("max: " + max);
        System.out.println("average: " + average);

//        int k;
//        System.out.println("please enter an integer number between 1 to 10:");
//        k = scanner.nextInt();
//
//        int [][] t = new int[k][(k*2)-1];
//
//        for (int i = 0; i < k; i++) {
//            for (int j = 0; j <= i; j++) {
//                if (j == 0 || j == i) {
//
//                    t[i][j] = 1;
//                } else {
//
//                    t[i][j] = t[i-1][j-1] + t[i-1][j];
//                }
//            }
//        }


//        System.out.println("Pascal's triangle:");
//        for (int i = 0; i < k; i++) {
//
//            for (int distance = 0; distance < k - i - 1; distance++) {
//                System.out.print("  ");
//            }
//
//            for (int j = 0; j <= i; j++) {
//                System.out.print(t[i][j] + "   ");
//            }
//            System.out.println();
//        }




    }
}
