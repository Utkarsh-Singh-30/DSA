1class Solution {
2    class Pair{
3        int freq;
4        int val;
5
6        Pair(int val, int freq){
7            this.val=val;
8            this.freq=freq;
9        }
10    }
11    public class Compare implements Comparator<Pair>{
12        public int compare(Pair a, Pair b){
13            if(a.freq>b.freq)return -1;
14            else if(a.freq<b.freq) return 1;
15            else return 0;
16        }
17    }
18    public int[] topKFrequent(int[] nums, int k) {
19        HashMap<Integer,Integer> map = new HashMap<>();
20
21        for(int i:nums){
22            if(!map.containsKey(i))map.put(i,1);
23            else{
24                map.put(i,map.get(i)+1);
25            }
26        }
27
28        PriorityQueue<Pair> pq= new PriorityQueue<>(new Compare());
29        
30        for(int i:map.keySet()){
31            pq.add(new Pair(i,map.get(i)));
32            System.out.print(i);
33        }
34
35        int []ans = new int [k];
36        for(int i =0;i<k;i++){
37            ans[i]=pq.peek().val;
38            pq.remove();
39        }
40        return ans;
41    }
42}