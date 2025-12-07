1class Solution {
2    public int climbStairs(int n) {
3        if(n==1) return 1;
4        if(n==2) return 2;
5        int a=1;
6        int b=2;
7        int sum=0;
8        for(int i=1;i<=n-2;i++){
9            sum=a+b;
10            a=b;
11            b=sum;
12        }
13        return sum;
14    }
15}