1class Solution {
2    public List<List<Integer>> permute(int[] nums) {
3        List<List<Integer>> ans = new ArrayList<>();
4        helper(nums,0,ans);
5        return ans;
6    }
7    public void helper(int []nums, int idx, List<List<Integer>> ans){
8        if(idx==nums.length-1){
9            List<Integer> list= new ArrayList<>();
10            for(int i=0;i<nums.length;i++){
11                list.add(nums[i]);
12            }
13            ans.add(list);
14            return;
15        }
16        for(int i=idx;i<nums.length;i++){
17            swap(idx,i,nums);
18            helper(nums,idx+1,ans);
19            swap(idx,i,nums);
20        }
21    }
22    public void swap(int i,int j,int[]arr){
23        int temp=arr[i];
24        arr[i]=arr[j];
25        arr[j]=temp;
26    }
27}