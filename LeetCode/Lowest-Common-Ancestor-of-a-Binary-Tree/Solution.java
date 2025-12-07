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
12        if(root==p || root==q) return root;
13        boolean left=contains(root.left,p);
14        boolean right=contains(root.right,q);
15        if((left && right)|| (!left && !right)) return root;
16        if(left && !right) return lowestCommonAncestor(root.left, p,q);
17        if(!left && right) return lowestCommonAncestor(root.right, p,q);
18        return null;
19    }
20
21    public boolean contains(TreeNode root, TreeNode node){
22        if(root==null) return false;
23        if(root==node) return true;
24        return contains(root.left,node) || contains(root.right,node);
25    }
26}