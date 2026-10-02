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
17    int  ans=0;
18    // public int diameterOfBinaryTree(TreeNode root) {
19    //     if(root==null ||(root.left==null && root.right==null)) return 0;
20    //     int left=diameterOfBinaryTree(root.left);
21    //     int right=diameterOfBinaryTree(root.right);
22    //     int mid=heightByEdges(root.left)+heightByEdges(root.right);
23    //     if(root.right!=null)mid++;
24    //     if(root.left!=null)mid++;
25    //     int max= Math.max(left,Math.max(mid,right));
26    //     return max;
27
28    // }
29   public int diameterOfBinaryTree(TreeNode root) {
30        // if(root==null ||(root.left==null && root.right==null)) return 0;
31        // int dameter=
32        if (root==null) return 0;
33        heightByEdges(root);
34        return ans;
35
36   }
37    public int heightByEdges(TreeNode root){
38        if(root==null) return -1;
39        int lh = heightByEdges(root.left);
40        int rh = heightByEdges(root.right);
41        ans = Math.max(ans,lh+rh+2);
42        return Math.max(lh,rh)+1;
43    }
44}