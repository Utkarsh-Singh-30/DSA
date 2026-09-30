1class Solution {
2    public List<List<Integer>> combinationSum(int[] nums, int target) {
3        List<List<Integer>> ans = new ArrayList<>();
4        helper(ans,nums, target,0,new ArrayList<>());
5        return ans;
6    }
7
8    public void helper(List<List<Integer>> ans, int []nums, int target, int idx, ArrayList<Integer> temp){
9        if(idx>=nums.length || target<0) return;
10
11        if(target==0){
12            ans.add(new ArrayList<>(temp));
13            return;
14        }
15
16        temp.add(nums[idx]);
17        helper(ans, nums, target-nums[idx],idx,temp);
18        temp.remove(temp.size()-1);
19        
20        helper(ans, nums, target,idx+1,temp);
21
22    }
23}