package exp03;
import java.util.Scanner;

public class E3_5 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter number of rows: ");
            int rows = input.nextInt();
            System.out.print("Enter number of columns: ");
            int cols = input.nextInt();

            int[][] matrix = new int[rows][cols];

            System.out.println("Enter matrix elements:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = input.nextInt();
                }
            }

            System.out.print("Enter row to remove (1 to " + rows + "): ");
            int removeRow = input.nextInt() - 1;

            System.out.print("Enter column to remove (1 to " + cols + "): ");
            int removeCol = input.nextInt() - 1;


            int[][] newMatrix = new int[rows - 1][cols - 1];

            int r = 0;
            for (int i = 0; i < rows; i++) {
                if (i == removeRow) continue;
                int c = 0;
                for (int j = 0; j < cols; j++) {
                    if (j == removeCol) continue;
                    newMatrix[r][c] = matrix[i][j];
                    c++;
                }
                r++;
            }


            System.out.println("\nOriginal matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("\nMatrix after removing row " + (removeRow + 1)
                    + " and column " + (removeCol + 1) + ":");
            for (int i = 0; i < newMatrix.length; i++) {
                for (int j = 0; j < newMatrix[i].length; j++) {
                    System.out.print(newMatrix[i][j] + " ");
                }
                System.out.println();
            }

        }
    }

