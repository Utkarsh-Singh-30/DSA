1class Solution {
2    public int maxProfit(int[] prices) {
3        int max_profit=0,min =prices[0];
4        for(int i=0;i<prices.length;i++){
5            if(min>prices[i])
6            min=prices[i];
7            int profit=prices[i]-min;
8            if(max_profit<profit)
9            max_profit=profit;
10        }
11        return max_profit;
12    }
13}