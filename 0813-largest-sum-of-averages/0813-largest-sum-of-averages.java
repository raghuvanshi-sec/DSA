class Solution {
    public double largestSumOfAverages(int[] nums, int k) {
        
        int n = nums.length;

        double[] prefix = new double[n+1];

        for(int i=1;  i <= n; i++){
            prefix[i] = prefix[i-1] + nums[i-1];
        }

        double[][] dp = new double[n+1][k+1];

        for(int i=0; i<= n; i++){
            for(int g=0; g<=k; g++){
                dp[i][g] = Double.NEGATIVE_INFINITY;
            }
        }

        dp[0][0] = 0.0;

        for(int g=1; g<=k; g++){
            for(int i=g; i<= n; i++){
                for(int j=g-1; j<i; j++){
                    double avg = (prefix[i] - prefix[j]) / (i-j);

                    dp[i][g] = Math.max(dp[i][g], dp[j][g-1] + avg);
                }
            }
        }
        return dp[n][k];
    }
}