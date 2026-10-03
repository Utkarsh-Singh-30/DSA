1class Solution {
2    public boolean canJump(int[] nums) {
3        int maxjump=0;
4        for(int i=0;i<nums.length;i++){
5            if(i>maxjump) return false;
6
7            maxjump=Math.max(maxjump, i+nums[i]);
8        }
9        return true;
10    }
11}