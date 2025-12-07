1class Solution {
2    public int search(int[] nums, int target) {
3        int lb = 0, ub = nums.length - 1;
4        while (lb <= ub) {
5            int mid = lb + (ub - lb) / 2;
6            if (nums[mid] == target)
7                return mid;
8            else if (nums[mid] < nums[ub]) {
9                if (target > nums[mid] && target <= nums[ub])
10                    lb = mid + 1;
11                else
12                    ub = mid - 1;
13            } else {
14                if (target >= nums[lb] && target < nums[mid])
15                    ub = mid - 1;
16                else
17                    lb = mid + 1;
18            }
19        }
20        return -1;
21    }
22}
23