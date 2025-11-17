import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SudokuGame {

    private int[][] sudoku;
    private Scanner input;

    public SudokuGame() {
        this.sudoku = new int[9][9];
        this.input = new Scanner(System.in);
    }

    public void initializeFromFile(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (scanner.hasNextInt()) {
                        sudoku[i][j] = scanner.nextInt();
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("File not found! " + e.getMessage());
        }
    }

    public void printSudoku() {
        System.out.println("Sudoku:");
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

    public void enterNumber() {
        System.out.println("Enter number of row (1-9):");
        int row = input.nextInt() - 1;

        System.out.println("Enter number of column (1-9):");
        int col = input.nextInt() - 1;

        System.out.println("Enter your number:");
        int number = input.nextInt();

        if (row < 0 || row > 8 || col < 0 || col > 8 || number < 1 || number > 9) {
            System.out.println("Invalid choice!");
            return;
        }

        if (isValidMove(row, col, number)) {
            sudoku[row][col] = number;
            System.out.println("Number placed successfully!");
            printSudoku();
        } else {
            System.out.println("Invalid move! Number already exists in row, column or box.");
        }
    }

    public boolean isValidMove(int row, int col, int number) {

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

    public boolean isSudokuComplete() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudoku[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isSudokuValid() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (sudoku[i][j] != 0 && !isValidMove(i, j, sudoku[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }

    public void checkSolution() {
        if (isSudokuComplete() && isSudokuValid()) {
            System.out.println("Sudoku solved correctly!");
            printSudoku();
        } else {
            System.out.println("Sudoku is not solved correctly!");
        }
    }

    public void displayMenu() {
        System.out.println("Sudoku Menu");
        System.out.println("Choose an option:");
        System.out.println("1- Enter a number");
        System.out.println("2- Print sudoku");
        System.out.println("3- Check solution");
        System.out.println("4- Exit");
    }

    public int getMenuChoice() {
        return input.nextInt();
    }

    public void closeScanner() {
        input.close();
    }
}
