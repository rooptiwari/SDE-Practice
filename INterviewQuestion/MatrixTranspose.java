package INterviewQuestion;

public class MatrixTranspose {
    public static void transposeInPlace(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap elements across the diagonal
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    // Helper to print matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row)
                System.out.print(num + " ");
            System.out.println();
        }
    }

    // Driver code
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        transposeInPlace(matrix);

        System.out.println("Transposed Matrix:");
        printMatrix(matrix);
    }
}

