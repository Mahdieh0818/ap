package exp03;

public class E3_1 {
        public static void main(String[] args) {
            int[][] A = {
                    {1, 2, 3},
                    {4, 5, 6}
            };

            int[][] B = {
                    {7, 8},
                    {9, 10},
                    {11, 12}
            };

            int r1 = A.length;
            int c1 = A[0].length;
            int r2 = B.length;
            int c2 = B[0].length;

            if (c1 != r2) {
                System.out.println("Matrix multiplication not possible!");
                return;
            }

            int[][] C = new int[r1][c2];

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    C[i][j] = 0;
                    for (int k = 0; k < c1; k++) {
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }


            System.out.println("Matrix A:");
            printMatrix(A);

            System.out.println("\nMatrix B:");
            printMatrix(B);

            System.out.println("\nResult of A x B:");
            printMatrix(C);
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

