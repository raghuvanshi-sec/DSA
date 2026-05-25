package Arrays;

public class Stocks {
    
    public static int buyAndSellStocks(int prices[]){
        int buyPrices = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i=0; i<prices.length; i++){
            if(buyPrices < prices[i]){ //pofit
                int profit = prices[i] - buyPrices; // today's profit
                maxprofit = Math.max(maxprofit, profit);
            }else{
                buyPrices = prices[i];
            }
        }
        return maxprofit;
    }


    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        System.out.println("Maximum profit is: " + buyAndSellStocks(prices));
    }
}
