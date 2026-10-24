package Dyanmic_Programming;

public class Knapsack {
    
    //recusion - gives wrong answers
    public static int knapsack(int val[], int wt[], int W, int i) {
        if (W == 0 || i == 0) {
            return 0;
        }

        if (wt[i - 1] <= W) {
            //include
            int ans1 = val[i - 1] + knapsack(val, wt, W - wt[i - 1], i - 1);

            //exclude
            int ans2 = knapsack(val, wt, W, i - 1);

            return Math.max(ans1, ans2);
        } else {
            return knapsack(val, wt, W, i - 1);
        }
    }
    
    //memoization
    public static int knapsackMemo(int val[], int wt[], int W, int i, int[][] dp) {

        if (W == 0 || i == 0) {
            return 0;
        }

        if (dp[i][W] != -1) {
            return dp[i][W];
        }

        if (wt[i - 1] <= W) {
            //include
            int ans1 = val[i - 1] + knapsackMemo(val, wt, W - wt[i - 1], i - 1, dp);

            //exclude
            int ans2 = knapsackMemo(val, wt, W, i - 1, dp);

            dp[i][W] = Math.max(ans1, ans2);
        } else {
            dp[i][W] = knapsackMemo(val, wt, W, i - 1, dp);
        }
        return dp[i][W];

    }

    //tabulation
    public static int knapsackTab(int val[], int wt[], int W) {
        int n = val.length;
        int[][] dp = new int[n + 1][W + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                int v = val[i - 1];
                int w = wt[i - 1];
                if (w <= j) {
                    int incProfit = v + dp[i - 1][j - w];
                    int excProfit = dp[i - 1][j];

                    dp[i][j] = Math.max(incProfit, excProfit);
                } else {
                    int excProfit = dp[i - 1][j];
                    dp[i][j] = excProfit;
                }
            }
        }
        print(dp);
        return dp[n][W];
    }
    
    public static void print(int dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void main(String args[]) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;
        int dp[][] = new int[val.length+1][W+1];
        //System.out.println(knapsack(val,wt, W, val.length));

        for(int i = 0; i< dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                dp[i][j] = -1;
            }
        }

        //System.out.println(knapsackMemo(val, wt, W, val.length, dp));

        System.out.println(knapsackTab(val, wt, W));
        // print(dp); // Note: dp here is the memoization array (-1s). Tabulation prints its own table inside knapsackTab.
    }
}
