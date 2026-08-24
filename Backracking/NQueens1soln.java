package Backracking;

public class NQueens1soln {

    public static boolean NQueens(char board[][], int row) {
        // Base case
        if (row == board.length) {
            return true;
        }
        // Column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                // Choose
                board[row][j] = 'Q';
                // Explore
                if (NQueens(board, row + 1)) {
                    return true;
                }
                // Undo
                board[row][j] = 'x';
            }
        }
        return false;
    }

    public static boolean isSafe(char board[][], int row, int col) {
        // Check upper column
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1;i >= 0 && j >= 0;i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1;i >= 0 && j < board.length;i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void printBoard(char board[][]) {
        System.out.println("--------Chess Board---------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int n = 4;
        char board[][] = new char[n][n];
        // Initialize board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        if (NQueens(board, 0)) {
            System.out.println("Solution exists:");
            printBoard(board);
        } else {
            System.out.println("No solution exists");
        }
    }
}