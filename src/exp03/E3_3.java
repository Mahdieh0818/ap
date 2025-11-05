package exp03;

public class E3_3 {
        public static void main(String[] args) {
            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9},
                    {2, 10, 1}
            };

            int maxSum = Integer.MIN_VALUE;
            int maxRowIndex = -1;

            for (int i = 0; i < matrix.length; i++) {
                int rowSum = 0;

                for (int j = 0; j < matrix[i].length; j++) {
                    rowSum += matrix[i][j];
                }

                if (rowSum > maxSum) {
                    maxSum = rowSum;
                    maxRowIndex = i;
                }
            }

            System.out.println("Matrix:");
            printMatrix(matrix);

            System.out.println("\nRow with the largest sum: " + (maxRowIndex + 1));
            System.out.println("Sum of that row: " + maxSum);

            System.out.print("Elements of that row: ");
            for (int value : matrix[maxRowIndex]) {
                System.out.print(value + " ");
            }
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

