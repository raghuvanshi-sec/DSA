class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < buyPrice) {
                buyPrice = price;          // Buy at the lowest price
            } else {
                maxProfit = Math.max(maxProfit, price - buyPrice);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices ={10,11,14,7,3};

        Solution sol = new Solution();
        System.out.println("Maximum profit is: " + sol.maxProfit(prices));
    }
}