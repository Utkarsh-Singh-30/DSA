1// class MinStack {
2//     Stack<Integer> st = new Stack<>();
3//     Stack<Integer> min = new Stack<>();
4//     public MinStack() {
5//         // constructor
6//     }
7    
8//     public void push(int val) {
9//         if(st.isEmpty()){
10//             min.push(val);
11//         }
12//         else{
13//             min.push(Math.min(val,min.peek()));
14//         }
15//         st.push(val);
16//     }
17    
18//     public void pop() {
19//         st.pop();
20//         min.pop();
21//     }
22    
23//     public int top() {
24//         return st.peek();
25//     }
26    
27//     public int getMin() {
28//         return min.peek();
29//     }
30// }
31
32
33class MinStack {
34    Stack<Long> st = new Stack<>();
35    long min=-1;
36    public MinStack() {
37        // constructor
38    }
39    
40    public void push(int val) {
41        long x= (long)val;
42        if(st.isEmpty()){
43            st.push(x);
44            min=x;
45        }
46        else if(x<min){
47            st.push(2*x-min);
48            min=x;
49        }
50        else{
51            st.push(x);
52        }
53    }
54    
55    public void pop() {
56        long x= (long)st.peek();
57        if(x<min){
58            min=2*min - x;
59        }
60        st.pop();
61    }
62    
63    public int top() {
64        long x= (long)st.peek();
65        if(x<min){
66            return (int)min;
67        }
68        return (int)x;
69    }
70    
71    public int getMin() {
72        return (int)min;
73    }
74}
75
76/**
77 * Your MinStack object will be instantiated and called as such:
78 * MinStack obj = new MinStack();
79 * obj.push(val);
80 * obj.pop();
81 * int param_3 = obj.top();
82 * int param_4 = obj.getMin();
83 */