package Sudoku;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku("input.txt");
        sudoku.loadFromFile();

        Scanner sc = new Scanner(System.in);

        System.out.println("Initial Sudoku:");
        sudoku.printMatrix();

        sudoku.startTimer();

        while (!sudoku.isComplete()) {
            System.out.println("\nOptions:");
            System.out.println("1. Set number");
            System.out.println("2. Save game");
            System.out.print("Choose option (1 or 2): ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter row (0-8): ");
                int row = sc.nextInt();
                System.out.print("Enter col (0-8): ");
                int col = sc.nextInt();
                System.out.print("Enter number (1-9): ");
                int num = sc.nextInt();

                if (sudoku.setNumber(row, col, num)) {
                    System.out.println("Number set successfully!");
                } else {
                    System.out.println("Invalid move! Try again.");
                }
                sudoku.printMatrix();

            } else if (choice == 2) {
                System.out.print("Enter file name to save (e.g., save.txt): ");
                String saveFile = sc.next();
                sudoku.saveToFile(saveFile);
            } else {
                System.out.println("Invalid option! Choose 1 or 2.");
            }
        }

        System.out.println("\nCongratulations! Sudoku completed.");
        System.out.println("Elapsed time: " + sudoku.getElapsedTime() + " ms");
        System.out.println("Fill Count: " + sudoku.getFillCount());
        System.out.println("Remove Count: " + sudoku.getRemoveCount());
        sc.close();
    }
}
