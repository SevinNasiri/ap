package exp03;

import java.util.Scanner;

public class Main_E3_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the count of rows:");
        int rows = scanner.nextInt();
        System.out.print("enter the count of cols:");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

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

        int maxSum = 0;
        int maxSumRow = 0;

        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
            }

            if (i == 0 || rowSum > maxSum) {
                maxSum = rowSum;
                maxSumRow = i;
            }
        }
        System.out.println("result is:");
        System.out.println("Row with the highest total: " + maxSumRow);
        System.out.println("The sum of the elements of this row: " + maxSum);

        scanner.close();
    }

}
