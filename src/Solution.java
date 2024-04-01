import java.lang.reflect.Array;

public class Solution {
    public static int[][] task11(int size) {
        return Matrix.createRandomMatrix(size, size);
    }

    public static int[][] task12(int[][] matrix, int el) {
        int[][] res = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                res[i][j] = matrix[i][j] + el;
            }
        }

        return res;
    }

    public static long task13(int[][] matrix) {
        long sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum = sum + matrix[i][j];
            }
        }

        return sum;
    }

    public static int[][] task2(int n, int m) {
        int[][] matrix = new int[n][m];
        int counter = 0;
        boolean flag = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!flag) {
                    matrix[i][j] = counter;
                } else {
                    matrix[i][m - j - 1] = counter;
                }
                counter++;
            }
            flag = !flag;
        }

        return matrix;
    }

    public static String[][] taskStar() {
        String[][] stringMatrix = new String[8][8];
        boolean flag = false;
        for (int i = 0; i < stringMatrix.length; i++) {
            for (int j = 0; j < stringMatrix[i].length; j++) {
                if (!flag) {
                    stringMatrix[i][j] = "W";
                } else {
                    stringMatrix[i][j] = "B";
                }
                flag = !flag;

            }
            flag = !flag;
        }

        return stringMatrix;
    }

}
