1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        int n=text1.length();
4        int m=text2.length();
5        int [][]mat=new int [n][m];
6        for(int i=0;i<n;i++){
7            for(int j=0;j<m;j++){
8                if(text1.charAt(i)!=text2.charAt(j)){
9                    if(i-1<0 && j-1<0) mat[i][j]=0;
10                    else if(i-1<0) mat[i][j]=mat[i][j-1];
11                    else if(j-1<0) mat[i][j]=mat[i-1][j];
12                    else mat[i][j]=Math.max(mat[i][j-1], mat[i-1][j]);
13                }
14                else{
15                    if(i-1<0 || j-1<0) mat[i][j]=1;
16                    else mat[i][j]=1+mat[i-1][j-1];
17                }
18            }
19        }
20        return mat[n-1][m-1];
21    }
22}