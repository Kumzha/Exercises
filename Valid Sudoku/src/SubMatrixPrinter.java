public class SubMatrixPrinter {
    public static void main(String[] args) {
        // Example 9x9 matrix
        int[][] matrix = new int[9][9];
        
        // Initialize the matrix with some values for demonstration
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                matrix[i][j] = i * 9 + j + 1;
            }
        }

        // Print the 9x9 matrix
        System.out.println("Original 9x9 Matrix:");
        printMatrix(matrix);

        // Print the 3x3 submatrices
        for (int row = 0; row < 9; row += 3) {
            for (int col = 0; col < 9; col += 3) {
                System.out.println("3x3 Submatrix starting at (" + row + ", " + col + "):");
                printSubMatrix(matrix, row, col);
            }
        }
    }

    // Method to print a 3x3 submatrix
    public static void printSubMatrix(int[][] matrix, int startRow, int startCol) {
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Method to print the full 9x9 matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}