class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1 ) return 0;
        int maxprofit = 0, min = Integer.MAX_VALUE;
        for(int i = 0;i<prices.length;i++){
            min = min > prices[i]? prices[i]:min;
            if(maxprofit < prices[i] - min){
                maxprofit = prices[i] - min;
            }
        }
        return maxprofit;
    }
}
