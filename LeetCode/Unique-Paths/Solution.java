1class Solution {
2    public int uniquePaths(int m, int n) {
3        int [][] dp = new int [m][n];
4        return totalWays(0,0,m-1,n-1,dp);
5    }
6    public int totalWays(int sr, int sc, int er, int ec,int[][] dp){
7        if(sr>er || sc>ec) return 0;
8        if(dp[sr][sc]!=0) return dp[sr][sc];
9        if(sr==er && sc==ec) return 1;
10
11        int ans= totalWays(sr,sc+1,er,ec,dp)+totalWays(sr+1,sc,er,ec,dp);
12        dp[sr][sc]=ans;
13        return ans;
14    }
15}