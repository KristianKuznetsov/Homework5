import java.util.Random;

public class Matrix {
    //Если длина format ебольшая может вызвать ошибку
    public static void formatMatrixOutput(int[][] matrix, int format){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(" ".repeat(format - elLength(matrix[i][j])) + Integer.toString(matrix[i][j]));
            }
            System.out.println();
        }
    }

    public static int elLength(int el){
        return String.valueOf(el).length();
    }

    public static int[][] createRandomMatrix(int n, int m){
        int[][] matrix = new int[n][m];
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt();
            }
        }

        return matrix;
    }

    public static int getMaxLengthElement(int[][] matrix){
        int maxLength = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(maxLength < elLength(matrix[i][j])){
                    maxLength = elLength(matrix[i][j]);
                }
            }
        }

        return maxLength;
    }

}
