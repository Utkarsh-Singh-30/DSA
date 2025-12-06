1// class Solution {
2//     public int[] maxSlidingWindow(int[] nums, int k) {
3//         int n = nums.length;
4//         int z=0;
5//         int []ans = new int [n-k+1];
6//         Stack<Integer> st = new Stack<>();
7//         int []nge = new int [n];
8//         for(int i =n-1;i>=0;i--){
9//             nge[i]=n;
10//             while(!st.isEmpty() && nums[st.peek()]<nums[i])st.pop();
11//             if(!st.isEmpty())nge[i]=st.peek();
12//             st.push(i);
13//         }
14//         int j =0;
15//         for(int i=0;i<n-k+1;i++){
16//             if(j>=i+k) j=i;
17//             int max=nums[j];
18//             while(j<i+k){
19//                 max=nums[j];
20//                 j=nge[j];
21//             }
22//             ans[z++]=max;
23//         }
24//         return ans;
25//     }
26// }
27
28// Sliding window...
29class Solution {
30    public int[] maxSlidingWindow(int[] nums, int k) {
31        Deque<Integer> dq = new ArrayDeque<>();
32        int n = nums.length;
33        int[] ans = new int[n - k + 1];
34        int i = 0, j = 0;
35        int l = 0;
36        while (j < n) {
37            while (!dq.isEmpty() && nums[j] > dq.peekLast()) {
38                dq.removeLast();
39            }
40
41            dq.addLast(nums[j]);
42            if (j - i + 1 == k) {
43                ans[l++] = dq.peek();
44
45                if (nums[i] == dq.peek())
46                    dq.removeFirst();
47                i++;
48            }
49            j++;
50        }
51        return ans;
52    }
53}