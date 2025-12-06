1class MedianFinder {
2
3    PriorityQueue<Integer> left;
4    // = new PriorityQueue<>(Comparator.reverseOrder());
5    PriorityQueue<Integer> right;
6    // = new PriorityQueue<>();
7    public MedianFinder() {
8        left= new PriorityQueue<>(Comparator.reverseOrder());
9        right= new PriorityQueue<>();
10    }
11    
12    public void addNum(int num) {
13        if(left.isEmpty()) {
14            left.add(num);
15        }
16        else if(num>left.peek()){ // going in right 
17            if(right.size()<left.size()) right.add(num);
18            else if(right.size()==left.size()){
19                right.add(num);
20                left.add(right.remove());
21            }
22        }
23
24        else{ // going in left
25            if(right.size()==left.size()) left.add(num);
26            else{
27                right.add(left.remove());
28                left.add(num);
29            }
30        }
31    }
32    
33    public double findMedian() {
34        if(left.size()>right.size()) return (double)left.peek();
35        else return (double) ((left.peek()+right.peek())/2.0);
36    }
37}
38
39/**
40 * Your MedianFinder object will be instantiated and called as such:
41 * MedianFinder obj = new MedianFinder();
42 * obj.addNum(num);
43 * double param_2 = obj.findMedian();
44 */