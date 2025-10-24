import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Sudoku {

    public static int[][] sudoku = new int[9][9];
    public static Scanner input = new Scanner(System.in);

    public static void printSudoku() {
        System.out.println("sudoku:");
        for (int i = 0; i < 9; i++) {
            System.out.print("| ");

            for (int j = 0; j < 9; j++) {
                if (sudoku[i][j] == 0) {
                    System.out.print("  ");
                } else {
                    System.out.print(sudoku[i][j] + " ");
                }
                if ((j + 1) % 3 == 0 && j != 8) {
                    System.out.print("| ");
                }
            }
            System.out.println("|");
            if ((i + 1) % 3 == 0 && i != 8) {
                System.out.println("|-------+-------+-------|");
            }
        }
    }

    public static void enterNumber() {

        System.out.println("enter number of row:(1-9)");
        int row = input.nextInt() - 1;

        System.out.println("enter number of col:(1-9)");
        int col = input.nextInt() - 1;

        System.out.println("enter your number:");
        int number = input.nextInt();

        if (row < 0 || row > 8 || col < 0 || col > 8 || number < 1 || number > 9) {
            System.out.println("invalid choice!");
        }
        if (isValidMove(row, col, number)) {
            sudoku[row][col] = number;
            System.out.println("Number placed successfully!");
            printSudoku();
        } else {
            System.out.println("Invalid move! Number already exists in row, column or box.");
        }
    }

    public static boolean isValidMove(int row, int col, int number) {

        for (int j = 0; j < 9; j++) {
            if (sudoku[row][j] == number && j != col) {
                return false;
            }
        }

        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == number && i != row) {
                return false;
            }
        }

        int boxRow = (row / 3) * 3;
        int boxCol = (col / 3) * 3;

        for (int i = boxRow; i < boxRow + 3; i++) {
            for (int j = boxCol; j < boxCol + 3; j++) {
                if (sudoku[i][j] == number && i != row && j != col) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isSudokuComplete() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudoku[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isSudokuValid() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudoku[i][j] != 0 && !isValidMove(i, j, sudoku[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void checkSolution() {
        if (isSudokuComplete() && isSudokuValid()) {
            System.out.println("Sudoku solved correctly!");
            printSudoku();
        } else {
            System.out.println("Sudoku is not solved correctly!");
        }
    }

    public static void main(String[] args) {

        String fileName = "sudoku.txt";

        try (Scanner scanner = new Scanner(new File(fileName))) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (scanner.hasNextInt()) {
                        sudoku[i][j] = scanner.nextInt();
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("file not found!" + e.getMessage());
        }

        do {
            printSudoku();
            System.out.println("sudoku menu");
            System.out.println("choose an option:");
            System.out.println("1- enter a number");
            System.out.println("2- print sudoku");
            System.out.println("3- check solution");
            System.out.println("4- exit");

            int choice = input.nextInt();

            switch (choice) {

                case 1:
                    enterNumber();
                    break;

                case 2:
                    printSudoku();
                    break;

                case 3:
                    checkSolution();
                    break;

                case 4:
                    System.out.println("final sudoku:");
                    printSudoku();
                    System.out.println("exit...");
                    return;

                default:
                    System.out.println("invalid option!");
            }
        } while (!isSudokuComplete());


    }
}
