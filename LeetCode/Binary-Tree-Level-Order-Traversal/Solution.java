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
18        Queue<TreeNode> qu = new LinkedList<>();
19
20        List<List<Integer>> ans = new ArrayList<>();
21        if(root==null) return ans;
22
23        qu.add(root);
24        while(!qu.isEmpty()){
25            int size= qu.size();
26            List<Integer> temp =new ArrayList<>();
27            for(int i=0;i<size;i++){
28                TreeNode node = qu.remove();
29                temp.add(node.val);
30                if(node.left!=null) qu.add(node.left);
31                if(node.right!=null) qu.add(node.right);
32
33            }
34            ans.add(temp);
35        }
36        return ans;
37    }
38}