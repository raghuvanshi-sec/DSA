public class DaigonalSum {

    // Optimized approach: O(n) time complexity
    public static int diagonalSum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            // Primary diagonal: i == j
            sum += matrix[i][i];

            // Secondary diagonal: i + j == matrix.length - 1 -> j = matrix.length - 1 - i
            // We must ensure that we do not double count the center element for odd-sized matrices
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        return sum;
    }

    // Brute force approach: O(n^2) time complexity (for reference)
    public static int diagonalSumBruteForce(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    sum += matrix[i][j];
                } else if (i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        int matrix[][] = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 },
            { 13, 14, 15, 16 }
        };

        System.out.println("Diagonal Sum (Optimized O(N)): " + diagonalSum(matrix));
        System.out.println("Diagonal Sum (Brute Force O(N^2)): " + diagonalSumBruteForce(matrix));
    }
}
