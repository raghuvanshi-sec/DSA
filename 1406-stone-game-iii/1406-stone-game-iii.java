class Solution {

    Integer[] dp;

    public String stoneGameIII(int[] stoneValue) {

        dp = new Integer[stoneValue.length];

        int diff = solve(0, stoneValue);

        if (diff > 0)
            return "Alice";
        if (diff < 0)
            return "Bob";

        return "Tie";
    }

    private int solve(int i, int[] a) {

        if (i >= a.length)
            return 0;

        if (dp[i] != null)
            return dp[i];

        int take = 0;
        int ans = Integer.MIN_VALUE;

        for (int k = 0; k < 3 && i + k < a.length; k++) {
            take += a[i + k];
            ans = Math.max(ans, take - solve(i + k + 1, a));
        }

        return dp[i] = ans;
    }
}