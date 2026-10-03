1class Solution {
2    public boolean canJump(int[] nums) {
3        if(nums[0]==0 && nums.length==1) return true;
4        if(nums[0]==0) return false;
5        for(int i=0;i<nums.length-1;i++){
6            if(nums[i]==0){
7                int k =i-1;
8                int topass=2;
9                boolean flag=false;
10                while(k>=0){
11                    if(nums[k]>=topass) {
12                        flag=true;
13                        break;
14                    }
15                    else {
16                        k--;
17                        topass++;
18                    }
19                }
20                if(!flag) return false;
21            }
22        }
23        return true;
24    }
25}