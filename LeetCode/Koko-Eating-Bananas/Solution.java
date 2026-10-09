1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3        int s=1,e=maxP(piles);
4
5        int ans = Integer.MAX_VALUE;
6        while(s<=e){
7            int mid = s+(e-s)/2;
8
9            if(valid(mid,piles,h)){
10                ans=mid;
11                e=mid-1;
12            }
13            else s=mid+1;
14        }
15        return ans;
16    }
17
18    public int maxP(int []arr){
19        int max=arr[0];
20        for(int i:arr) max=Math.max(i,max);
21        return max;
22    }
23
24    public boolean valid(int k, int []arr, int h){
25        int hr=0;
26        for(int i =0;i<arr.length;i++){
27            double val=Math.ceil((double)arr[i]/k);
28            hr+=val;
29            // System.out.println(val);
30
31        }
32        // System.out.println(hr);
33        return hr<=h;
34    }
35}