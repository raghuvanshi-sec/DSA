class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {

            // Top → left to right
            for (int j = startCol; j <= endCol; j++) {
                ans.add(matrix[startRow][j]);
            }

            // Right → top to bottom
            for (int i = startRow + 1; i <= endRow; i++) {
                ans.add(matrix[i][endCol]);
            }

            // Bottom → right to left
            if (startRow < endRow) {
                for (int j = endCol - 1; j >= startCol; j--) {
                    ans.add(matrix[endRow][j]);
                }
            }

            // Left → bottom to top
            if (startCol < endCol) {
                for (int i = endRow - 1; i > startRow; i--) {
                    ans.add(matrix[i][startCol]);
                }
            }

            // Shrink the boundary
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

        return ans;
    }
}