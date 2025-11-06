package exp03;

import java.util.Scanner;

public class Main_E3_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int m1[][] = new int[5][5];
        int m2[][] = new int[5][5];
        int result[][] = new int[5][5];

        System.out.println("enter elements of first matrix:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("[" + i + "][" + j + "] : ");
                m1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("enter elements of second matrix:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("[" + i + "][" + j + "] : ");
                m2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
               result[i][j] =0;

                for (int k = 0; k < 5; k++) {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }

        System.out.println("result is: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
