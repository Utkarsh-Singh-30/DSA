1class Solution {
2    public int change(int amount, int[] coins) {
3        // int m = coins.length;
4        // if(m==1){
5        //     if(amount%coins[0]!=0) return 0;
6        //     else return 1;
7        // }
8        // int n = amount;
9        // int dp[][]= new int[m+1][n+1];
10        // dp[0][0]=1;
11        // for(int i=1;i<=n;i++){
12        //     dp[0][i]=0;
13        // }
14        // for(int i=1;i<=m;i++){
15        //     for(int j=0;j<=n;j++){
16        
17        //         if(coins[i-1]>j){
18        //             dp[i][j]=dp[i-1][j];
19        //         }
20        //         else{
21        //             dp[i][j]=dp[i-1][j] + dp[i][j-coins[i-1]];
22        //         }
23        //     }
24        // }
25        // return dp[m][n];
26
27        return ways(coins, amount);
28    }
29
30    // space optimize
31
32    public int ways (int []coins, int amount){
33        int n= amount;
34        int []dp = new int [n+1]; 
35        dp[0]=1;
36        for(int i:coins){
37            for(int j= i;j<=n;j++){
38                dp[j]+=dp[j-i];
39            }
40        }
41
42        return dp[n];
43    }
44}