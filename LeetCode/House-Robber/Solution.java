1class Solution {
2    public int rob(int[] nums) {
3        int n= nums.length;
4        if(n==1) return nums[0];
5        if(n==2) return Math.max(nums[0], nums[1]);
6        // int []dp = new int[n];
7        // dp[0]=nums[0];
8        // dp[1]=Math.max(nums[0],nums[1]);
9        // for(int i=2;i<n;i++){
10        //     dp[i]=Math.max(dp[i-1], nums[i]+dp[i-2]);
11        // }
12
13        // return dp[n-1];
14        int i=nums[0];
15        int j=Math.max(nums[0], nums[1]);
16        int ans=0;
17        for(int k=2;k<n;k++){
18            ans=Math.max(j,nums[k]+i);
19            i=j;
20            j=ans;
21        }
22        return ans;
23    }
24}