1class Solution {
2    public int majorityElement(int[] nums) {
3        int count=0;
4        int container=0;
5        for(int i=0;i<nums.length;i++){
6            if(count==0){
7                container=nums[i];
8            }
9            if(nums[i]==container)count++;
10            else count--;
11        }
12        return container;
13    }
14}