package exp03;

import java.util.Scanner;

public class Main_E3_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the count of rows:");
        int rows = scanner.nextInt();
        System.out.print("enter the count of cols:");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        int[][] transpose = new int[cols][rows];

        System.out.println("enter elements of matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("matrix is: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("result is: ");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
