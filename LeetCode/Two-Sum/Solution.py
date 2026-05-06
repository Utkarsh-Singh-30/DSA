1class Solution:
2    def twoSum(self, nums: List[int], target: int) -> List[int]:
3        n = len(nums)
4        map={}
5
6        for i in range(n):
7            num = nums[i]
8            diff = target-num
9
10            if diff in map:
11                return [i, map[diff]]
12            
13            map[num]=i
14
15