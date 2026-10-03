1class Solution {
2    public int canCompleteCircuit(int[] gas, int[] cost) {
3        int n = gas.length;
4        int sum=0;
5
6        for(int i:gas) sum+=i;
7
8        for(int i:cost)sum-=i;
9
10        if(sum<0)return -1;
11        int idx=0, res=0;
12        for(int i =0;i<n;i++){
13            res+=gas[i]-cost[i];
14            if(res<0){
15                res=0;
16                idx=i+1;
17            }
18        }
19        return idx;
20    }
21}