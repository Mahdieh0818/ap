package exp03;

public class E3_6 {

        public static void main(String[] args) {

            int[][] matrix = {
                    {1, 2, 1, 3},
                    {4, 5, 6, 1},
                    {7, 8, 9, 2},
                    {1, 1, 1, 1}
            };

            int rows = matrix.length;
            int cols = matrix[0].length;

            int maxSum = Integer.MIN_VALUE;
            int startRow = 0;
            int startCol = 0;


            for (int i = 0; i < rows - 1; i++) {
                for (int j = 0; j < cols - 1; j++) {
                    int sum = matrix[i][j] + matrix[i][j + 1]
                            + matrix[i + 1][j] + matrix[i + 1][j + 1];

                    if (sum > maxSum) {
                        maxSum = sum;
                        startRow = i;
                        startCol = j;
                    }
                }
            }


            System.out.println("Original matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }


            System.out.println("\n2x2 submatrix with maximum sum:");
            for (int i = startRow; i < startRow + 2; i++) {
                for (int j = startCol; j < startCol + 2; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.println("Maximum sum = " + maxSum);
        }
    }

