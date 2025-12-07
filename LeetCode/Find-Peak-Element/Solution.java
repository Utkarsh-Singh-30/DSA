1class Solution {
2    public int findPeakElement(int[] nums) {
3        int lb = 0, ub = nums.length - 1;
4        if(nums.length==1)
5            return 0;
6        while (lb <= ub) {
7            int mid = lb + (ub - lb) / 2;
8            if(mid==0){
9                if(nums[mid]>nums[mid+1])
10                    return mid;
11                else
12                    return 1;
13            }
14            else if(mid==ub){
15                return nums[mid]>nums[mid-1]? mid:mid-1;
16            }
17            else if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid+1])
18                return mid;
19            else if (nums[mid] < nums[mid- 1])
20                ub = mid - 1;
21            else
22                lb=mid+1;
23        }
24        return -1;
25    }
26}