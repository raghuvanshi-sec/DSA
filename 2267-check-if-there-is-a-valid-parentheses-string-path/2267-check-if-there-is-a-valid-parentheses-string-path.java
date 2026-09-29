class Solution {
    public boolean hasValidPath(char[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        int len = rows + cols - 1;

        // A valid parentheses string must have even length
        if ((len & 1) == 1) {
            return false;
        }

        // First and last character must be '(' and ')'
        if (grid[0][0] == ')' || grid[rows - 1][cols - 1] == '(') {
            return false;
        }

        int maxBalance = len / 2;

        boolean[][][] dp =
            new boolean[rows][cols][maxBalance + 1];

        // Starting cell must be '('
        dp[0][0][1] = true;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (i == 0 && j == 0) {
                    continue;
                }

                for (int balance = 0; balance <= maxBalance; balance++) {

                    int prevBalance;

                    if (grid[i][j] == '(') {
                        // Previous balance + 1 = current balance
                        prevBalance = balance - 1;
                    } else {
                        // Previous balance - 1 = current balance
                        prevBalance = balance + 1;
                    }

                    if (prevBalance < 0 || prevBalance > maxBalance) {
                        continue;
                    }

                    if ((i > 0 && dp[i - 1][j][prevBalance]) ||
                        (j > 0 && dp[i][j - 1][prevBalance])) {

                        dp[i][j][balance] = true;
                    }
                }
            }
        }

        return dp[rows - 1][cols - 1][0];
    }
}