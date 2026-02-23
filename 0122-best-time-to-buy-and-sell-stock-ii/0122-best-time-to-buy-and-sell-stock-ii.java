class Solution {
    public int maxProfit(int[] prices) {
        int lowest=0;
        int profit = 0;
        for(int i=0; i<prices.length-1; i++){
            // lowest = Math.min(lowest,prices[i]);
            if(prices[i]<prices[i+1]){
                profit += prices[i+1]-prices[i] ;
            }

        }
        return profit;
    }
}