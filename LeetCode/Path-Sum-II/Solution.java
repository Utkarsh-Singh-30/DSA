1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
18        List<List<Integer>> ans = new ArrayList<>();
19        List<Integer> arr = new ArrayList<>();
20        helper(root,targetSum,arr,ans);
21        return ans;
22    }
23
24    public void helper(TreeNode root, int sum,List<Integer> arr,List<List<Integer>> ans){
25        if(root==null)return;
26
27        arr.add(root.val);
28        if(root.left==null && root.right==null && sum-root.val==0){
29            ans.add(new ArrayList<>(arr));
30        }
31        else{
32            helper(root.left, sum-root.val,arr,ans);
33            helper(root.right, sum-root.val,arr,ans);
34        }
35
36        arr.remove(arr.size()-1);
37    }
38}