1class Solution {
2    public int mySqrt(int x) {
3        int lb=1;
4        int ub=x;
5        int ans =0;
6        while(lb<=ub){
7            int mid= lb+(ub-lb)/2;
8            if(mid==x/mid)return mid;
9            if(mid>x/mid) ub=mid-1;
10            else {
11                ans=mid;
12                lb= mid+1;
13            }
14        }
15        return ans;
16    }
17}