class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        int n= nums.length;
        if(n%k!=0){
            return false;
        }
        Arrays.sort(nums);
        Map<Integer, Integer> freq= new HashMap<>();
        for(int i=0; i<n; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i],0)+1);
        }
        for(int num: nums){
            if(freq.get(num)==0) continue;
            for(int i=0; i<k; i++){
                if(freq.getOrDefault(num+i,0)==0) return false;
                freq.put(num+i, freq.get(num+i)-1);
            }
        }
        return true;
    }
}