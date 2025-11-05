package exp03;

public class E3_2 {
        public static void main(String[] args) {
            int[][] matrix = {
                    {3, 8},
                    {4, 6}
            };

            int determinant = (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);

            System.out.println("Matrix:");
            printMatrix(matrix);

            System.out.println("\nDeterminant = " + determinant);
        }

        public static void printMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                for (int value : row) {
                    System.out.print(value + "\t");
                }
                System.out.println();
            }
        }
    }

