1class Solution {
2    public int maxProfit(int[] prices) {
3        int maxProfit=0;
4        int buy=prices[0];
5        for(int i =0;i<prices.length;i++){
6            if(buy>=prices[i])buy=prices[i];
7            else{
8            int currProfit=prices[i]-buy;
9            maxProfit=Math.max(maxProfit,currProfit);
10            }
11        }
12        return maxProfit;
13    }
14}