public class generateMatrix {
    
    
    public static int[][] generateMatrix(int n) {

        int[][] matrix = new int[n][n];

        int startRow = 0;
        int startCol = 0;
        int endRow = n - 1;
        int endCol = n - 1;

        int value = 1;

        while (startRow <= endRow && startCol <= endCol) {

            // Top → left to right
            for (int j = startCol; j <= endCol; j++) {
                matrix[startRow][j] = value++;
            }

            // Right → top to bottom
            for (int i = startRow + 1; i <= endRow; i++) {
                matrix[i][endCol] = value++;
            }

            // Bottom → right to left
            if (startRow < endRow) {
                for (int j = endCol - 1; j >= startCol; j--) {
                    matrix[endRow][j] = value++;
                }
            }

            // Left → bottom to top
            if (startCol < endCol) {
                for (int i = endRow - 1; i > startRow; i--) {
                    matrix[i][startCol] = value++;
                }
            }

            // Shrink boundaries
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

        return matrix;
    }

    public static void main(String[] args){

        int n = 4;
        int[][] matrix = generateMatrix(n);

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

