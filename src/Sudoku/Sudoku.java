package Sudoku;

import java.util.Scanner;
import java.io.PrintWriter;

public class Sudoku {
    private String fileAddress;
    private int[][] matrix;
    private long startTime;
    private int fillCount;
    private int removeCount;

    public Sudoku(String fileAddress) {
        this.fileAddress = fileAddress;
        this.matrix = new int[9][9];
        this.fillCount = 0;
        this.removeCount = 0;
    }

    public void loadFromFile() {
        try {
            Scanner sc = new Scanner(new java.io.File(fileAddress));
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    matrix[i][j] = sc.nextInt();
                    if (matrix[i][j] != 0) fillCount++;
                    else removeCount++;
                }
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public void printMatrix() {
        System.out.println("   0 1 2 3 4 5 6 7 8");
        for (int i = 0; i < 9; i++) {
            System.out.print(i + "  ");
            for (int j = 0; j < 9; j++) {
                System.out.print(matrix[i][j] == 0 ? ". " : matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isValid(int row, int col, int num) {
        if (matrix[row][col] != 0) return false;

        for (int i = 0; i < 9; i++)
            if (matrix[row][i] == num || matrix[i][col] == num)
                return false;

        int boxRow = row - row % 3;
        int boxCol = col - col % 3;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (matrix[boxRow + i][boxCol + j] == num)
                    return false;

        return true;
    }

    public boolean setNumber(int row, int col, int num) {
        if (isValid(row, col, num)) {
            matrix[row][col] = num;
            fillCount++;
            removeCount--;
            return true;
        }
        return false;
    }

    public void startTimer() {
        startTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return System.currentTimeMillis() - startTime;
    }

    public boolean isComplete() {
        return removeCount == 0;
    }
    public int getFillCount() {
        return fillCount;
    }

    public int getRemoveCount() {
        return removeCount;
    }

    public void saveToFile(String saveFileAddress) {
        try {
            PrintWriter writer = new PrintWriter(saveFileAddress);
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    writer.print(matrix[i][j] + " ");
                }
                writer.println();
            }
            writer.close();
            System.out.println("Game saved successfully to " + saveFileAddress);
        } catch (Exception e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }
}
