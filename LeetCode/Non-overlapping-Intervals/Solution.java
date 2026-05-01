1class Solution {
2    public int eraseOverlapIntervals(int[][] intervals) {
3        // Arrays.sort(intervals, (a,b) ->{
4        //     if(a[1]==b[1]) 
5        //     return Integer.compare(a[0],b[0]);
6        //     else return Integer.compare(a[1],b[1]);
7        // });
8
9        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
10        int count=0;
11        int prev=intervals[0][1];
12        for(int i=1;i<intervals.length;i++){
13            int curr=intervals[i][0];
14            if(curr<prev){
15                count++;
16            }
17            else prev=intervals[i][1];
18        }
19        return count;
20    }
21}