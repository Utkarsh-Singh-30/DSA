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
17    TreeNode prev = null;
18    boolean flag=true;
19    public void inorder(TreeNode root){
20        if(root==null) return;
21        inorder(root.left);
22        if(prev==null) prev=root;
23        else if(prev.val>=root.val) flag=false;
24        else prev=root;
25        inorder(root.right);
26    }
27    public boolean isValidBST(TreeNode root) {
28        inorder(root);
29        return flag;
30    }
31}