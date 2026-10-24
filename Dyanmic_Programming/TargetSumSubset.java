package Dyanmic_Programming;

public class TargetSumSubset {
    
    public static boolean isSumSubset(int num[], int sum) {

        int n = num.length;
        boolean dp[][] = new boolean[n + 1][sum + 1];

        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = true;
        }

        for (int j = 0; j < sum + 1; j++) {
            dp[0][j] = false;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int w = num[i - 1];
                if (w <= j) {
                    dp[i][j] = dp[i - 1][j - w] || dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }

            }
        }
        print(dp);
        return dp[n][sum];
    }
    
    public static void print(boolean dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int sum = 10;
        int num[] = { 4, 2, 7, 1, 3 };
        System.out.println(isSumSubset(num, sum));
        System.out.println();
    }
}
