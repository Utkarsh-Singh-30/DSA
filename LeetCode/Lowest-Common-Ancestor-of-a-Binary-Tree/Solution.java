1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10class Solution {
11    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
12        if(root==null) return root;
13        if(root==p || root==q) return root;
14        TreeNode left = lowestCommonAncestor(root.left,p,q);
15        TreeNode right = lowestCommonAncestor(root.right,p,q);
16        if(left!= null && right!=null)return root;
17        if(left!=null)return left;
18        else return right;
19    }
20}