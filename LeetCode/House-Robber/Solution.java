1class Solution {
2    public int rob(int[] nums) {
3        int n =nums.length;
4        if(n==1) return nums[0];
5
6        // return helper(0,nums, n);
7
8        // int []memo= new int [n];
9        // Arrays.fill(memo,-1);
10        // return helper2(0,nums, n,memo);
11
12        return helper3(nums,n);
13    }
14
15
16    public int helper(int i, int []nums, int n){
17
18        if(i>=n) return 0;
19
20        return Math.max(nums[i] + helper(i+2,nums, n), helper(i+1,nums, n));
21    }
22
23    public int helper2(int i, int []nums, int n, int []memo){
24
25        if(i>=n) return 0;
26
27        if(memo[i]!=-1) return memo[i];
28
29        memo[i]= Math.max(nums[i] + helper2(i+2,nums, n,memo), helper2(i+1,nums, n,memo));
30        return memo[i];
31    }
32
33    public int helper3(int []nums, int n ){
34        int []dp = new int [n];
35        
36        if(n==2) return Math.max(nums[0], nums[1]);
37
38        dp[n-1]=nums[n-1];
39        dp[n-2]= Math.max(nums[n-1], nums[n-2]);
40
41        for(int i=n-3;i>=0;i--){
42            dp[i]=Math.max(nums[i]+dp[i+2], dp[i+1]);
43        }
44
45        return dp[0];
46    }
47
48
49}