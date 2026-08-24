class Solution {

    int count = 0;

    public int totalNQueens(int n) {

        char[][] board = new char[n][n];

        // Initialize board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        solve(board, 0);

        return count;
    }

    public void solve(char[][] board, int row) {

        // Base case
        if (row == board.length) {
            count++;
            return;
        }

        // Try every column
        for (int col = 0; col < board.length; col++) {

            if (isSafe(board, row, col)) {

                // Choose
                board[row][col] = 'Q';

                // Explore
                solve(board, row + 1);

                // Undo
                board[row][col] = 'X';
            }
        }
    }

    public boolean isSafe(char[][] board, int row, int col) {

        // Check upper column
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0;
             i--, j--) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < board.length;
             i--, j++) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }
}