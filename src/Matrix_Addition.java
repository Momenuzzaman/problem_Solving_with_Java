public class Matrix_Addition {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;

        int[][] matrix1 = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        int[][] matrix2 = {
                {5, 4, 3, 2, 1},
                {10, 9, 8, 7, 6},
                {15, 14, 13, 12, 11},
                {20, 19, 18, 17, 16},
                {25, 24, 23, 22, 21}
        };

        int[][] resultMatrix = addMatrices(matrix1, matrix2, rows, cols);

        System.out.println("Resultant Matrix after Addition:");
        printMatrix(resultMatrix, rows, cols);
    }


    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2, int rows, int cols) {
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix, int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
