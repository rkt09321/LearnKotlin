package javatest.trickyquestion;
import java.util.Arrays;

public class Question14 {
        // Function to convert the matrix
        private static void convert(int[][] mat) {
            int M = mat.length;
            int N = mat[0].length;

            boolean rowFlag = false, colFlag = false;

            // scan first row for any 0's
            for (int j = 0; j < N; j++) {
                if (mat[0][j] == 0) {
                    rowFlag = true;
                    break;
                }
            }

            // scan first column for any 0's
            for (int i = 0; i < M; i++) {
                if (mat[i][0] == 0) {
                    colFlag = true;
                    break;
                }
            }

            // process rest of the matrix and use first row &
            // first column to mark if any cell in corresponding
            // row or column has value 0 or not
            for (int i = 1; i < M; i++) {
                for (int j = 1; j < N; j++) {
                    if (mat[i][j] == 0) {
                        mat[0][j] = mat[i][0] = 0;
                    }
                }
            }

            // if (0, j) or (i, 0) is 0, assign 0 to cell (i, j)
            for (int i = 1; i < M; i++) {
                for (int j = 1; j < N; j++) {
                    if (mat[0][j] == 0 || mat[i][0] == 0) {
                        mat[i][j] = 0;
                    }
                }
            }

            // if rowFlag is true, then assign 0 to all cells of first row
            for (int i = 0; rowFlag && i < N; i++) {
                mat[0][i] = 0;
            }

            // if colFlag is true, then assign 0 to all cells of first column
            for (int i = 0; colFlag && i < M; i++) {
                mat[i][0] = 0;
            }
        }

        public static void main(String[] args)
        {
            int[][] mat =
                    {
                            { 5, 3, 0, 8, 1 },
                            { 8, 1, 8, 4, 7 },
                            { 2, 6, 5, 0, 3 },
                            { 1, 4, 2, 7, 9 },
                            { 0, 1, 3, 6, 5 }
                    };

            // convert the matrix
            convert(mat);

            // print matrix
            for (int[] r: mat) {
                System.out.println(Arrays.toString(r));
            }
        }
}
