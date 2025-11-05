package exp03;

public class E3_4 {
        public static void main(String[] args) {
            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6}
            };

            int rows = matrix.length;
            int cols = matrix[0].length;

            int[][] transpose = new int[cols][rows];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    transpose[j][i] = matrix[i][j];
                }
            }

            System.out.println("Original matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("\nTranspose matrix:");
            for (int i = 0; i < cols; i++) {
                for (int j = 0; j < rows; j++) {
                    System.out.print(transpose[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

