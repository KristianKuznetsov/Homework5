import java.util.Arrays;
import java.util.Scanner;

public class SolutionCollector {
    public static void homework5Task1() {
        System.out.println("Задача 1.1");
        int[][] m1 = Solution.task11(4);
        int maxLength1 = Matrix.getMaxLengthElement(m1);
        System.out.println("Случайная матрица:");
        Matrix.formatMatrixOutput(m1, maxLength1 + 3);
        System.out.println();

        System.out.println("Задача 1.2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите целое число:");
            scanner.next();
        }
        int element = scanner.nextInt();
        int[][] m2 = Solution.task12(m1, element);
        int maxLength2 = Matrix.getMaxLengthElement(m2);
        System.out.println("Новая матрица:");
        Matrix.formatMatrixOutput(m2, maxLength2 + 3);
        System.out.println();

        System.out.println("Задача 1.2");
        System.out.println("Сумма -> " + Solution.task13(m2));

        System.out.println();
        System.out.println("**************************************************************************");
        System.out.println();
    }

    public static void homework5Task2() {
        System.out.println("Задача 2");

        String[][] matrix = Solution.taskStar();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("**************************************************************************");
        System.out.println();
    }

    public static void homework5TaskStar() {
        int n = 4;
        int m = 6;

        int[][] matrix = Solution.task2(n, m);
        int maxLength = Matrix.getMaxLengthElement(matrix);

        System.out.println("Задача *");
        Matrix.formatMatrixOutput(matrix, maxLength + 1);

        System.out.println();
        System.out.println("**************************************************************************");
        System.out.println();
    }


}
