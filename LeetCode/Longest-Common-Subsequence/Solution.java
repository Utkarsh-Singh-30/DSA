1class Solution {
2    public int longestCommonSubsequence(String text1, String text2) {
3        if(text1.equals(text2)) return text1.length();
4        int n=text1.length();
5        int m=text2.length();
6        int [][]mat=new int [n+1][m+1];
7        for (int i = 0; i <= n; i++) {
8            for (int j = 0; j <= m; j++) {
9                if (i == 0 || j == 0)
10                    mat[i][j] = 0;
11                else if (text1.charAt(i - 1) == text2.charAt(j - 1))
12                    mat[i][j] = mat[i - 1][j - 1] + 1;
13                else
14                    mat[i][j] = Math.max(mat[i - 1][j], mat[i][j - 1]);
15            }
16        }
17        return mat[n][m];
18    }
19}