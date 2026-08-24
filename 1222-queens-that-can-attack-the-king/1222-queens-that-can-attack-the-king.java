class Solution {

    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        
        List<List<Integer>> ans = new ArrayList<>();
        boolean[][] board = new boolean[8][8];
        // Store queen positions
        for (int[] queen : queens) {
            board[queen[0]][queen[1]] = true;
        }

        // 8 directions
        int[][] directions = {
            {-1, -1},  // upper-left
            {-1, 0},   // up
            {-1, 1},   // upper-right
            {0, -1},   // left
            {0, 1},    // right
            {1, -1},   // lower-left
            {1, 0},    // down
            {1, 1}     // lower-right
        };

        // Check all 8 directions
        for (int[] dir : directions) {
            int row = king[0] + dir[0];
            int col = king[1] + dir[1];

            while (row >= 0 && row < 8 && col >= 0 && col < 8) {
                // First queen found
                if (board[row][col]) {
                    ans.add(Arrays.asList(row, col));
                    // Stop this direction
                    break;
                }
                row += dir[0];
                col += dir[1];
            }
        }
        return ans;
    }
}