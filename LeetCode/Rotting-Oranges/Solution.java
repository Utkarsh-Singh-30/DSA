1class Solution {
2    class Pair{
3        int row;
4        int col;
5        int time;
6
7        Pair(int row, int col, int time){
8            this.row=row;
9            this.col=col;
10            this.time=time;
11        }
12    }
13
14    public int orangesRotting(int[][] grid) {
15        int n = grid.length;
16        int m = grid[0].length;
17        int[][]vis = new int [n][m];
18
19        Queue<Pair> qu = new LinkedList<>();
20        int cntFresh=0;
21
22        for(int i=0;i<n;i++){
23            for(int j =0;j<m;j++){
24                if(grid[i][j]==2){
25                    qu.add(new Pair(i,j,0));
26                    vis[i][j]=2;
27                }
28                else vis[i][j]=0;   
29                if(grid[i][j]==1) cntFresh++;
30            }
31        }
32
33        int totalTime=0;
34        int []drow = {-1,0,1,0};
35        int []dcol = {0,1,0,-1};
36        int cnt=0;
37
38        while(!qu.isEmpty()){
39            int r= qu.peek().row;
40            int c= qu.peek().col;
41            int time = qu.peek().time;
42            totalTime= Math.max(totalTime, time);
43            qu.remove();
44            for(int i=0;i<4;i++){
45                int nrow = r+drow[i];
46                int ncol = c+dcol[i];
47
48                if(nrow>=0 && ncol>=0 && nrow<n && ncol<m && vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
49                    qu.add(new Pair(nrow,ncol, time+1));
50                    vis[nrow][ncol]=2;
51                    cnt++;
52                }
53            }
54        }
55
56        if(cnt!=cntFresh) return -1;
57
58        return totalTime;
59    }
60}