1class Solution {
2    public int minDistance(String s1, String s2) {
3        int  m = s1.length();
4        int  n = s2.length();
5        // int ways = editDistance(s1, s2, m-1,n-1 );
6        // return ways;
7
8        // int[][] dp =new int [m][n];
9        // for(int []i:dp)
10        //     Arrays.fill(i,-1);
11        // return edit(s1,s2,m-1,n-1,dp);
12
13        return edit2(s1,s2,m,n);
14    }
15
16    public int editDistance(String s1, String s2, int m , int n){
17        if(n<0) return m+1;
18        if(m<0) return n+1;
19
20        if(s1.charAt(m)==s2.charAt(n)) return editDistance(s1,s2,m-1,n-1);
21
22        return 1+ Math.min(editDistance(s1,s2,m-1,n-1), Math.min(editDistance(s1,s2,m,n-1), editDistance(s1,s2,m-1,n)));
23    }
24
25    //  using dp 
26
27    public int edit(String s1, String s2, int m , int n, int[][]dp){
28        if(n<0) return m+1;
29        if(m<0) return n+1;
30
31        if(dp[m][n]!=-1) return dp[m][n];
32        if(s1.charAt(m)==s2.charAt(n)) {
33            dp[m][n]= edit(s1,s2,m-1,n-1,dp);
34            return dp[m][n];
35        }
36
37        dp[m][n]= 1+ Math.min(edit(s1,s2,m-1,n-1,dp), Math.min(edit(s1,s2,m,n-1,dp), edit(s1,s2,m-1,n,dp))); 
38        return dp[m][n];       
39    }
40
41//  Tabulation
42    public int edit2 ( String s1, String s2, int m , int  n){
43        int [][]dp = new int [m+1][n+1];
44        for(int i =0;i<=m;i++) dp[i][0]= i;
45        for(int i =0;i<=n;i++) dp[0][i]= i;
46
47        for(int i=1;i<=m;i++){
48            for(int j =1;j<=n;j++){
49                if(s1.charAt(i-1)==s2.charAt(j-1)) dp[i][j]= dp[i-1][j-1];
50
51                else 
52                    dp[i][j] = 1+ Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1]));
53            }
54        }
55
56        return dp[m][n];
57    }
58
59}