1class Solution {
2    public int findDuplicate(int[] nums) {
3        int n = nums.length;
4        boolean [] vis = new boolean[n+1];
5
6        for(int i =0;i<n;i++){
7            if(!vis[nums[i]]) vis[nums[i]] = true;
8            else return nums[i];
9        }
10
11        return -1;
12    }
13}