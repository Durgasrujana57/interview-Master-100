***  Best Time to Buy and Sell Stock ****

class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int low=prices[0];
        for(int i=0;i<prices.length;i++) {
             int temp=prices[i]-low;
             profit=Math.max(profit,temp);
            if(prices[i]<low) {
                low=prices[i];
            }
             
        }
        return profit;
    }
}
