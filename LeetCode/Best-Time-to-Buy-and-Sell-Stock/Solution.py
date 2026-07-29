1class Solution {
2    public int maxProfit(int[] prices) {
3        int buy=prices[0];
4        int max=0;
5
6        for(int i=1;i<prices.length;i++){
7            if(prices[i]<buy) buy=prices[i];
8
9            int profit=prices[i]-buy;
10            max=Math.max(profit,max);
11        }
12        return max;
13    }
14}