1class Solution {
2    public List<List<Integer>> permuteUnique(int[] nums) {
3        Arrays.sort(nums);
4        // Set<List<Integer>> myset= new HashSet<>();
5        List<List<Integer>> ans = new ArrayList<>();
6        helper(nums,0,ans);
7        return ans;
8    }
9
10    public void helper(int []nums, int idx, List<List<Integer>> ans){
11        if(idx==nums.length-1){
12            List<Integer> list= new ArrayList<>();
13            for(int i=0;i<nums.length;i++){
14                list.add(nums[i]);
15            }
16            ans.add(list);
17            return;
18        }
19        for(int i=idx;i<nums.length;i++){
20          if(i!=idx && !canPermute(nums,i,idx)) continue;
21            swap(idx,i,nums);
22            helper(nums,idx+1,ans);
23            swap(idx,i,nums);
24        }
25    }
26    
27    public void swap(int i,int j,int[]arr){
28        int temp=arr[i];
29        arr[i]=arr[j];
30        arr[j]=temp;
31    }
32     public boolean canPermute(int[] nums,int curr,int idx){
33        for(int i=idx;i<curr;i++){
34            if(nums[i]==nums[curr]){
35                return false;
36            }
37        }
38        return true;
39    }
40}