1class Solution {
2    public int twoCitySchedCost(int[][] costs) {
3        Arrays.sort(costs,(a,b) -> Integer.compare((b[1]-b[0]),a[1]-a[0]));
4        int ans =0;
5        int n=costs.length/2;
6        for(int i=0;i<n;i++){
7            ans+=costs[i][0];
8            ans+=costs[i+n][1];
9        }
10        return ans;
11    }
12}