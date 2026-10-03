1class Solution {
2    public int maxProfit(int[] prices) {
3        int buy = prices[0];
4        int max = 0;
5        int profit = 0;
6
7        for (int i = 1; i < prices.length; i++) {
8            if(prices[i]>=buy) {
9                profit = prices[i] - buy;
10                max += profit;
11            }
12                buy = prices[i];
13        }
14        return max;
15    }
16}