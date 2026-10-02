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
17    public List<List<Integer>> levelOrder(TreeNode root) {
18        List<List<Integer>> ans = new ArrayList<>();
19        int h = height(root);
20        for(int i=1;i<=h;i++){
21            List<Integer> list = new ArrayList<>();
22            nthLevel(root,i,list);
23            ans.add(list);
24        }
25        return ans;
26    }
27
28    public int height(TreeNode root){
29        if(root==null) return 0;
30        return 1+ Math.max(height(root.left),height(root.right));
31    }
32
33    public void nthLevel(TreeNode root, int n ,List<Integer> list){
34        if(root==null)return;
35        if(n==1)list.add(root.val);
36        nthLevel(root.left,n-1,list);
37        nthLevel(root.right,n-1,list);
38    }
39}