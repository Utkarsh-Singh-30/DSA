1class Solution {
2    public boolean canJump(int[] nums) {
3        int n =nums.length;
4        int maxjump=0;
5        for(int i=0;i<nums.length;i++){
6            if(i>maxjump) return false;
7            maxjump=Math.max(maxjump, i+nums[i]);
8            if(maxjump>=n-1) return true;
9        }
10        return true;
11    }
12}