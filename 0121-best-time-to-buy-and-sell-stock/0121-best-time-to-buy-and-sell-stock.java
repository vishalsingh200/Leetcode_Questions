class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];                  //7    1     1     
        int profit = 0;                       //0    0     4
        for(int i = 1; i < prices.length; i++){             //i = 2  3
            int cost = prices[i] - min;       //-6           4     2
            profit = Math.max(profit, cost);  //(0, -6)=0,   4     4
            min = Math.min(min, prices[i]);   //(7,1)= 1,    1     1
        }
        return profit;
    }
}