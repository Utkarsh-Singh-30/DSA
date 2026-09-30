1class Solution {
2    public List<List<Integer>> combinationSum3(int k, int n) {
3        List<List<Integer>> ans = new ArrayList<>();
4        helper(ans, k,n, new ArrayList<>(),1);
5        return ans;
6    }
7
8    public void helper(List<List<Integer>> ans, int k , int target, ArrayList<Integer>temp, int idx){
9        if(target==0 && temp.size()==k){
10            ans.add(new ArrayList<>(temp));
11        }
12
13        if(idx>9 || target<0 ) return; 
14
15        for(int i =idx;i < 10 ;i++){
16        temp.add(i);
17        helper(ans, k, target-i,temp,i+1);
18        temp.remove(temp.size()-1);
19        }
20
21    }
22}