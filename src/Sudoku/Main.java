package Sudoku;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int[][] board = new int[9][9];
    static ArrayList<int[]> filledCells = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter sudoku file name (e.g., input.txt): ");
        String filename = input.nextLine().trim();
        if (filename.isEmpty()) filename = "Sudoku/input.txt";

        System.out.println("Current directory: " + System.getProperty("user.dir"));

        try {
            readBoardFromFile(filename);
        } catch (FileNotFoundException e) {
            System.out.println("❌ File '" + filename + "' not found!");
            input.close();
            return;
        }

        System.out.println("\n📄 Initial board:");
        printBoard(board);

        manualFill(input);

        System.out.println("\n📄 Final board:");
        printBoard(board);

        input.close();
    }

    static void readBoardFromFile(String filename) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(filename));
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                board[i][j] = sc.nextInt();
        sc.close();
    }

    static void printBoard(int[][] b) {
        for (int r = 0; r < 9; r++) {
            if (r % 3 == 0 && r != 0)
                System.out.println("------+-------+------");
            for (int c = 0; c < 9; c++) {
                if (c % 3 == 0 && c != 0) System.out.print("| ");
                System.out.print(b[r][c] == 0 ? ". " : b[r][c] + " ");
            }
            System.out.println();
        }
    }

    static int[] findEmpty(int[][] b) {
        for (int r = 0; r < 9; r++)
            for (int c = 0; c < 9; c++)
                if (b[r][c] == 0)
                    return new int[] { r, c };
        return null;
    }

    static boolean isSafe(int[][] b, int row, int col, int num) {
        for (int i = 0; i < 9; i++) {
            if (b[row][i] == num)
                return false;
            if (b[i][col] == num)
                return false;
        }
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int r = startRow; r < startRow + 3; r++)
            for (int c = startCol; c < startCol + 3; c++)
                if (b[r][c] == num)
                    return false;
        return true;
    }

    static void manualFill(Scanner input) {
        while (true) {
            printBoard(board);
            int[] empty = findEmpty(board);
            if (empty == null) {
                System.out.println("🎉 All cells are filled!");
                break;
            }

            int r = empty[0], c = empty[1];
            System.out.print("Enter number for cell (" + (r+1) + "," + (c+1) + ") [1-9, 0 to undo last]: ");
            int num = input.nextInt();

            if (num == 0) {  // Undo last filled cell
                if (!filledCells.isEmpty()) {
                    int[] last = filledCells.remove(filledCells.size() - 1);
                    board[last[0]][last[1]] = 0;
                    System.out.println("Last cell cleared!");
                } else {
                    System.out.println("No filled cells to undo.");
                }
                continue;
            }

            if (num < 1 || num > 9) {
                System.out.println("Invalid input! Enter 1-9 or 0 to undo.");
                continue;
            }

            if (isSafe(board, r, c, num)) {
                board[r][c] = num;
                filledCells.add(new int[]{r, c});  // store filled cell
            } else {
                System.out.println("Invalid number! Try again.");
            }
        }
    }
}
