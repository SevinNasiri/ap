import sudoku.SudokuGame;

public class Main_Sudoku {
    public static void main(String[] args) {

        SudokuGame game = new SudokuGame();

        String fileName = "sudoku.txt";
        game.initializeFromFile(fileName);

        do {
            game.printSudoku();
            game.displayMenu();

            int choice = game.getMenuChoice();

            switch (choice) {
                case 1:
                    game.enterNumber();
                    break;

                case 2:
                    game.printSudoku();
                    break;

                case 3:
                    game.checkSolution();
                    break;

                case 4:
                    System.out.println("Final sudoku:");
                    game.printSudoku();
                    System.out.println("Exiting...");
                    game.closeScanner();
                    return;

                default:
                    System.out.println("Invalid option!");
            }
        } while (!game.isSudokuComplete());

        game.closeScanner();
    }
}

