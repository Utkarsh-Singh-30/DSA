1class Solution {
2    public static int findDuplicate(int[] nums) {
3        int len = nums.length;
4        int low = 1;
5        int high = len - 1;
6        while (low < high) {
7            int mid = low + (high - low) / 2;
8            int cnt = 0;
9            for (int i = 0; i < len; i++) {
10                if (nums[i] <= mid) {
11                    cnt++;
12                }
13            }
14
15            if (cnt <= mid) {
16                low = mid + 1;
17            } else {
18                high = mid;
19            }
20        }
21
22        return low;
23    }
24}