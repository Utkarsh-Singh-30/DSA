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
16
17class Solution {
18    public boolean isValidBST(TreeNode root) {
19        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
20    }
21
22    private boolean helper(TreeNode node, long min, long max) {
23        if (node == null) return true;
24
25        if (node.val <= min || node.val >= max) return false;
26
27        return helper(node.left, min, node.val) &&
28               helper(node.right, node.val, max);
29    }
30}
31